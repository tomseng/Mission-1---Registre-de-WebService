package modele;

public class WebService {

	private int idWS;
	private String nomWS;
	private String typeWS;
	private String commentaireWS;

	public String getNomWS() {
		return nomWS;
	}

	public void setNomWS(String nomWS) {
		this.nomWS = nomWS;
	}

	public String getTypeWS() {
		return typeWS;
	}

	public void setTypeWS(String typeWS) {
		this.typeWS = typeWS;
	}

	public String getCommentaireWS() {
		return commentaireWS;
	}

	public void setCommentaireWS(String commentaireWS) {
		this.commentaireWS = commentaireWS;
	}

	public int getIdWS() {
		return idWS;
	}

	public void setIdWS(int idWS) {
		this.idWS = idWS;
	}
	@Override
	public String toString() {
		return "WebService [idWS=" + idWS + ", nomWS=" + nomWS + ", typeWS=" + typeWS + ", commentaireWS="
				+ commentaireWS + "]";
	}

	public WebService(String nomWS, String typeWS, String commentaireWS) {
		super();
		this.nomWS = nomWS;
		this.typeWS = typeWS;
		this.commentaireWS = commentaireWS;
	}

	public WebService() {
		super();
	}

}
