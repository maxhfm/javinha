package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Livro;
import exception.DaoException;

public class LivroDAO {

	private Map<Integer, Livro> livros;

	private static LivroDAO instance;

	public LivroDAO() {
		
		livros = new HashMap<Integer, Livro>();
		
	}

	public static LivroDAO getInstance() {
		if (instance == null) {
			instance = new LivroDAO();
		}
		return instance;
	}

	public void addLivro(Livro c) throws DaoException {
		livros.put(c.getCodigo(), c);
		Livro livro = getLivro(c.getCodigo());
		livro.getEditora().addLivro(livro);
	}

	public Livro updateLivro(Livro livroNovo) throws DaoException {
		livros.put(livroNovo.getCodigo(), livroNovo);
		return livroNovo;
	}

	public Livro getLivro(int codLivro) throws DaoException {
		if (livros.get(codLivro) == null) {
			throw new DaoException("");
		}
		Livro livro = livros.get(codLivro);
		return livro;

	}

	public Collection<Livro> getLivros() {
		return livros.values();
	}

	public void removeLivro(int codLivro) throws DaoException {
		if (livros.get(codLivro) == null) {
			throw new DaoException("");
		}
		//
		Livro livro = getLivro(codLivro);
		livro.getEditora().removeLivro(codLivro);
		//
		livros.remove(codLivro);
	}

}