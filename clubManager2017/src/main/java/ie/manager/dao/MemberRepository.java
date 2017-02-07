package ie.manager.dao;

import org.springframework.data.repository.CrudRepository;

import ie.manager.models.ClubMember;

public interface MemberRepository extends CrudRepository<ClubMember, String>{

}
