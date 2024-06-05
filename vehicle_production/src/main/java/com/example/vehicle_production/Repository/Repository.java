package com.example.vehicle_production.Repository;

import com.example.vehicle_production.Entity.Member;
import com.example.vehicle_production.Entity.Role;
import com.example.vehicle_production.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public class Repository {
    public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
    public interface MemberRepository extends JpaRepository<Member, String> {}
    public interface RoleRepository extends JpaRepository<Role, String> {}

}
