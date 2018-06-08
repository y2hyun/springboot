package net.yang.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import net.yang.core.entity.Example;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>, JpaSpecificationExecutor<Example> {

}
