package com.cams.app.repository.intrafaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cams.app.data.impl.PrivateFix;

@Repository
public interface PrivateFixRepository extends JpaRepository<PrivateFix, String> {

}
