package desafios.Audios;

public class Principal {

    public static void main(String[] args) {

        Audio audio = new Audio();
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        musica.setTitulo("Beyoncé");
        musica.setAlbum("Renaissance");

        for(int i = 0; i < 1000; i++) {
            musica.reproduco();
        }
        for(int i = 0; i < 50; i++) {
            musica.curte();
        }

        podcast.setTitulo("Bolha Dev");
        podcast.setHost("Marcus Mendes");

        for(int i = 0; i < 1000; i++) {
            podcast.reproduco();
        }
        for(int i = 0; i < 50; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);

    }
}