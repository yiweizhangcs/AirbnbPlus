package com.loffer.staybooking.repository;

import com.loffer.staybooking.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loffer.staybooking.model.Stay;
import com.loffer.staybooking.model.User;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByGuest(User guest);

    List<Reservation> findByStay(Stay stay);

    Reservation findByIdAndGuest(Long id, User guest);

    List<Reservation> findByStayAndCheckoutDateAfter(Stay stay, LocalDate date);
}

