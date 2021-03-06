// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.springsource.pizzashop.repository;

import com.springsource.pizzashop.domain.Topping;
import com.springsource.pizzashop.repository.ToppingRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

privileged aspect ToppingRepository_Roo_Jpa_Repository {
    
    declare parents: ToppingRepository extends JpaRepository<Topping, Long>;
    
    declare parents: ToppingRepository extends JpaSpecificationExecutor<Topping>;
    
    declare @type: ToppingRepository: @Repository;
    
}
