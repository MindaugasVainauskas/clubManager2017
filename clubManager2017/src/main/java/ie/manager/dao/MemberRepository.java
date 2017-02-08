package ie.manager.dao;

import org.springframework.data.repository.CrudRepository;

import ie.manager.models.Member;

public interface MemberRepository extends CrudRepository<Member, String>{

}
