package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Aluno;
import exception.DaoException;

public class AlunoDAO {

	private Map<Integer, Aluno> alunos;

	private static AlunoDAO instance;

	public AlunoDAO() {
		
		alunos = new HashMap<Integer, Aluno>();
		
	}

	public static AlunoDAO getInstance() {
		if (instance == null) {
			instance = new AlunoDAO();
		}
		return instance;
	}

	public void addAluno(Aluno c) throws DaoException {
		alunos.put(c.getCodigo(), c);
		getAluno(c.getCodigo());
	}

	public Aluno updateAluno(Aluno alunoNovo) throws DaoException {
		alunos.put(alunoNovo.getCodigo(), alunoNovo);
		return alunoNovo;
	}

	public Aluno getAluno(int codAluno) throws DaoException {
		if (alunos.get(codAluno) == null) {
			throw new DaoException("");
		}
		Aluno livro = alunos.get(codAluno);
		return livro;

	}

	public Collection<Aluno> getAlunos() {
		return alunos.values();
	}

	public void removeAluno(int codAluno) throws DaoException {
		if (alunos.get(codAluno) == null) {
			throw new DaoException("");
		}
		alunos.remove(codAluno);
	}

}