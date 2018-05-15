package com.cams.app.repository.intrafaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.app.data.impl.CoreAdoption;

@Repository
public interface CoreAdoptionRepository extends JpaRepository<CoreAdoption, String> {

}
