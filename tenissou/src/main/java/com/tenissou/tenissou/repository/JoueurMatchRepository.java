package com.tenissou.tenissou.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenissou.tenissou.identity.JoueurMatchIdentity;
import com.tenissou.tenissou.model.JoueurMatch;

@Repository
public interface JoueurMatchRepository extends JpaRepository<JoueurMatch, JoueurMatchIdentity>{
	
	List<JoueurMatch> findByJoueurMatchIdentityIdMatch(Long matchId);

}
