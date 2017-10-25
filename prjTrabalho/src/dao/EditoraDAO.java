package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Editora;
import exception.DaoException;

public class EditoraDAO {

	private Map<Integer, Editora> editoras;

	private static EditoraDAO instance;

	public EditoraDAO() {
		editoras = new HashMap<Integer, Editora>();
	}

	public static EditoraDAO getInstance() {
		if (instance == null) {
			instance = new EditoraDAO();
		}
		return instance;
	}

	public void addEditora(Editora c) throws DaoException {
		editoras.put(c.getCodigo(), c);
		getEditora(c.getCodigo());
	}

	public Editora updateEditora(Editora editoraNovo) throws DaoException {
		editoras.put(editoraNovo.getCodigo(), editoraNovo);
		return editoraNovo;
	}

	public Editora getEditora(int codEditora) throws DaoException {
		if (editoras.get(codEditora) == null) {
			throw new DaoException("");
		}
		Editora editora = editoras.get(codEditora);
		return editora;

	}

	public Collection<Editora> getEditoras() {
		return editoras.values();
	}

	public void removeEditora(int codEditora) throws DaoException {

		if (editoras.get(codEditora) == null) {
			throw new DaoException("");
		}
		editoras.remove(codEditora);
	}

}