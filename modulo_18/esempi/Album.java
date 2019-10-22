public class Album {
    public Album (int albumId){
        this.albumId =albumId;
    }
    
    public Album (int albumId, String artista, String titolo, int anno){
        this.albumId = albumId;
        this.artista = artista;
        this.titolo = titolo;
        this.anno = anno;
    }
    
    private String artista;
    private String titolo;
    private int anno;
    private int albumId;

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getAlbumId() {
        return albumId;
    }


    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

        
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }


}