//member service class to process all the queries related to members table in database
package ie.manager.services;

//imports
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ie.manager.dao.MemberRepository;
import ie.manager.models.ClubMember;

@Service
@Transactional
public class MemberService {

	private final MemberRepository memberRepo;

	public MemberService(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	//list to return all members found in the members table in database
	public List<ClubMember> listAllMembers(){
		List<ClubMember> memberList = new ArrayList<>();
		for(ClubMember cMember :memberRepo.findAll()){
			memberList.add(cMember);
		}
		
		return memberList;
	}
	
	
}
