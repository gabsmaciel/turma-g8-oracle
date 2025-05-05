package desafios.Audios;

public class Musica extends Audio {

    private String album;
    private String titulo;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return titulo;
    }

    public void setArtista(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500)
            return 10;
        else {
            return 8;
        }
    }

}
