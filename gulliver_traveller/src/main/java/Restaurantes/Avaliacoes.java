package Restaurantes;

public class Avaliacoes {
	
		private int id;
		private String autor;
		private int ranking;
		private String comentario;
		
		public Avaliacoes(int id, String usuario, int ranking, String comentario) {
			
			this.id = id;
			this.autor = autor;
			this.ranking = ranking;
			this.comentario = comentario;
			
		}
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getAutor() {
			return autor;
		}
		
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public int getRanking() {
			return ranking;
		}
		
		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
		
		public String getComentario() {
			return comentario;
		}
		
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		
}
