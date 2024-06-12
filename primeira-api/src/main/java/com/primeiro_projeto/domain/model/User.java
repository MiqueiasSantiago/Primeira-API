package com.primeiro_projeto.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Account acconunt;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Feature> features;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Card card;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<News> news;
	
	public Long getId() {return id;}
	
	public void setId(Long id) {this.id = id;}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
	
	public Account getAcconunt() {return acconunt;}
	
	public void setAcconunt(Account acconunt) {this.acconunt = acconunt;}
	
	public List<Feature> getFeatures() {return features;}
	
	public void setFeatures(List<Feature> features) {this.features = features;}
	
	public Card getCard() {return card;}
	
	public void setCard(Card card) {this.card = card;}
	
	public List<News> getNews() {return news;}
	
	public void setNews(List<News> news) {this.news = news;}
	
	
}
