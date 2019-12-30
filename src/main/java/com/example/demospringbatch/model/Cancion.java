package com.example.demospringbatch.model;

public class Cancion {

	private String id;
	private String Track_Name;
	private String Artist_Name;
	private String Genre;
	private int Beats_Per_Minute;
	private int Energy;
	private int Danceability;
	private int Loudness_dB;
	private int Liveness;
	private int Valence;
	private int Length;
	private int Acousticness;
	private int Speechiness;
	private int Popularity;

	public Cancion() {
		super();
	}

	public Cancion(String id, String track_Name, String artist_Name, String genre, int beats_Per_Minute, int energy,
			int danceability, int loudness_dB, int liveness, int valence, int length, int acousticness, int speechiness,
			int popularity) {
		super();
		this.id = id;
		Track_Name = track_Name;
		Artist_Name = artist_Name;
		Genre = genre;
		Beats_Per_Minute = beats_Per_Minute;
		Energy = energy;
		Danceability = danceability;
		Loudness_dB = loudness_dB;
		Liveness = liveness;
		Valence = valence;
		Length = length;
		Acousticness = acousticness;
		Speechiness = speechiness;
		Popularity = popularity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrack_Name() {
		return Track_Name;
	}

	public void setTrack_Name(String track_Name) {
		Track_Name = track_Name;
	}

	public String getArtist_Name() {
		return Artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getBeats_Per_Minute() {
		return Beats_Per_Minute;
	}

	public void setBeats_Per_Minute(int beats_Per_Minute) {
		Beats_Per_Minute = beats_Per_Minute;
	}

	public int getEnergy() {
		return Energy;
	}

	public void setEnergy(int energy) {
		Energy = energy;
	}

	public int getDanceability() {
		return Danceability;
	}

	public void setDanceability(int danceability) {
		Danceability = danceability;
	}

	public int getLoudness_dB() {
		return Loudness_dB;
	}

	public void setLoudness_dB(int loudness_dB) {
		Loudness_dB = loudness_dB;
	}

	public int getLiveness() {
		return Liveness;
	}

	public void setLiveness(int liveness) {
		Liveness = liveness;
	}

	public int getValence() {
		return Valence;
	}

	public void setValence(int valence) {
		Valence = valence;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getAcousticness() {
		return Acousticness;
	}

	public void setAcousticness(int acousticness) {
		Acousticness = acousticness;
	}

	public int getSpeechiness() {
		return Speechiness;
	}

	public void setSpeechiness(int speechiness) {
		Speechiness = speechiness;
	}

	public int getPopularity() {
		return Popularity;
	}

	public void setPopularity(int popularity) {
		Popularity = popularity;
	}

	@Override
	public String toString() {
		return "Top50 [id=" + id + ", Track_Name=" + Track_Name + ", Artist_Name=" + Artist_Name + ", Genre=" + Genre
				+ ", Beats_Per_Minute=" + Beats_Per_Minute + ", Energy=" + Energy + ", Danceability=" + Danceability
				+ ", Loudness_dB=" + Loudness_dB + ", Liveness=" + Liveness + ", Valence=" + Valence + ", Length="
				+ Length + ", Acousticness=" + Acousticness + ", Speechiness=" + Speechiness + ", Popularity="
				+ Popularity + "]";
	}
	
	
	
	

}
