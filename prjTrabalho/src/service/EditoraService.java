package service;

import java.util.Collection;
import java.util.Map;

import dao.EditoraDAO;
import dto.EditoraDTO;
import entity.Editora;
import entity.Livro;
import exception.DaoException;
import exception.ServiceException;
import exception.ServiceExceptionEnum;

public class EditoraService {
	private EditoraDAO dao;
	private Editora editora;
	
	public EditoraService() {
		this.dao = EditoraDAO.getInstance();
	}

	public EditoraDTO buscarEditora(int codigo) throws DaoException {
		try{
			EditoraDTO editoraDTO = new EditoraDTO(dao.getEditora(codigo).getCodigo(), dao
					.getEditora(codigo).getNome(), dao.getEditora(codigo).getCnpj(), dao.getEditora(codigo).getEndereco()
					);
			return editoraDTO;
		}
		catch(DaoException e)
		{
			throw new DaoException("A editora informada não existe");
		}
	}

	public void cadastrarEditora(EditoraDTO editoraDTO) throws ServiceException,
			DaoException {
		if ((editoraDTO.getCodigo() < 1) || (editoraDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.EDITORA_CODIGO_INVALIDO);
		}
		if ((editoraDTO.getNome().length() < 1)
				|| (editoraDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.EDITORA_NOME_INVALIDO);
		}
		if((editoraDTO.getCnpj().length() < 1 ||editoraDTO.getCnpj().length() > 19 )){
			
			throw new ServiceException(ServiceExceptionEnum.EDITORA_CNPJ_INVALIDO);
			
		}

		this.editora = new Editora(editoraDTO.getCodigo(), editoraDTO.getNome(), editoraDTO.getCnpj(), editoraDTO.getEndereco());

		try {
			dao.addEditora(this.editora);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void alterarEditora(EditoraDTO editoraDTO) throws ServiceException,
			DaoException {
		if ((editoraDTO.getCodigo() < 1) || (editoraDTO.getCodigo() > 99)) {
			throw new ServiceException(
					ServiceExceptionEnum.EDITORA_CODIGO_INVALIDO);
		}
		if ((editoraDTO.getNome().length() < 1)
				|| (editoraDTO.getNome().length() > 20)) {
			throw new ServiceException(ServiceExceptionEnum.EDITORA_NOME_INVALIDO);
		}

		Editora editora = new Editora(editoraDTO.getCodigo(), editoraDTO.getNome(), editoraDTO.getCnpj(), editoraDTO.getEndereco());

		try {
			dao.updateEditora(editora);
		} catch (DaoException e) {
			throw new DaoException("Erro no banco de dados");
		}
	}

	public void removerEditora(int codigo) throws DaoException {

		if (dao.getEditora(codigo).getLivros().size() > 0) {
			throw new DaoException("Existem livros vinculados a editora, delete eles primeiros.");
		}				
		
		
		try {
			dao.removeEditora(codigo);
		}
		catch(DaoException e)
		{
			throw new DaoException("A editora informada não existe");
		}
		
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public EditoraDAO getEditoraDAO() {
		return dao;
	}

	public void setEditoraDAO(EditoraDAO editora) {
		this.dao = editora;
	}
	
	public Map getLivros() {
		return editora.getLivros();
	}	
	
}
