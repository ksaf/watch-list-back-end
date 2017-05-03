package com.myproject.watchlist.watchlist.model;

import javax.persistence.Embeddable;

@Embeddable
public class Show {
	private String imdbId;
	private int savedSeason;
	private int savedEpisode;
	private int episodesForSavedSeason;
	
	public Show(){
		
	}
	
	public Show(String imdbId, int savedSeason, int savedEpisode, int episodesForSavedSeason) {
		this.imdbId = imdbId;
		this.savedSeason = savedSeason;
		this.savedEpisode = savedEpisode;
		this.episodesForSavedSeason = episodesForSavedSeason;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public int getSavedSeason() {
		return savedSeason;
	}
	public void setSavedSeason(int savedSeason) {
		this.savedSeason = savedSeason;
	}
	public int getSavedEpisode() {
		return savedEpisode;
	}
	public void setSavedEpisode(int savedEpisode) {
		this.savedEpisode = savedEpisode;
	}
	public int getEpisodesForSavedSeason() {
		return episodesForSavedSeason;
	}
	public void setEpisodesForSavedSeason(int episodesForSavedSeason) {
		this.episodesForSavedSeason = episodesForSavedSeason;
	}
	
	
}
