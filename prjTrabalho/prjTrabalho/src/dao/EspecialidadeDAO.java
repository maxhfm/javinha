package dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import entity.Especialidade;
import exception.DaoException;

public class EspecialidadeDAO {

	private Map<Integer, Especialidade> especialidades;

	private static EspecialidadeDAO instance;

	public EspecialidadeDAO() {
		especialidades = new HashMap<Integer, Especialidade>();
	}

	public static EspecialidadeDAO getInstance() {
		if (instance == null) {
			instance = new EspecialidadeDAO();
		}
		return instance;
	}

	public void addEspecialidade(Especialidade c) throws DaoException {
		especialidades.put(c.getCodigo(), c);
		getEspecialidade(c.getCodigo());
	}

	public Especialidade updateEspecialidade(Especialidade especialidadeNovo) throws DaoException {
		especialidades.put(especialidadeNovo.getCodigo(), especialidadeNovo);
		return especialidadeNovo;
	}

	public Especialidade getEspecialidade(int codEspecialidade) throws DaoException {
		if (especialidades.get(codEspecialidade) == null) {
			throw new DaoException("");
		}
		Especialidade especialidade = especialidades.get(codEspecialidade);
		return especialidade;

	}

	public Collection<Especialidade> getEspecialidades() {
		return especialidades.values();
	}

	public void removeEspecialidade(int codEspecialidade) throws DaoException {
		if (especialidades.get(codEspecialidade) == null) {
			throw new DaoException("");
		}
		especialidades.remove(codEspecialidade);
	}

}