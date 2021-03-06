package com.ezlabor.hiring.domain.repository;

import com.ezlabor.hiring.domain.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface OfferRepository extends JpaRepository<Offer,Long> {
    List<Offer> findAllByEmployerId(Long employerId);
    Optional<Offer> findByIdAndEmployerId(Long employerId, Long id);
    List<Offer> findAllBySpecialtyId(Long specialtyId);
}
