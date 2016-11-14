package fi.agileo.testi2;

public interface GeneerinenJono<E> {
	  public boolean empty();  // palauttaa true, jos Jono on tyhjä
	  public void push(E alkio); // lisää alkion Jonon viimeiseksi alkioksi
	  public E pop(); // poistaa ja palauttaa Jonon ensimmäisen alkion
	  public E front(); // palauttaa Jonon ensimmäiset alkion
	  public int size(); // palauttaa Jonon koon
}
