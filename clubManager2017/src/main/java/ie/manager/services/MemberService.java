//member service class to process all the queries related to members table in database
package ie.manager.services;

//imports
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ie.manager.dao.MemberRepository;
import ie.manager.models.Member;

@Service
@Transactional
public class MemberService {

	private final MemberRepository memberRepo;

	public MemberService(MemberRepository memberRepo) {
		this.memberRepo = memberRepo;
	}
	
	//list to return all members found in the members table in database
	public List<Member> listAllMembers(){
		List<Member> memberList = new ArrayList<>();
		for(Member cMember :memberRepo.findAll()){			
			memberList.add(cMember);
		}
		
		return memberList;
	}
	
	//find one member for editing.
	public Member getMember(String studentid){
		return memberRepo.findOne(studentid);
	}
	
	//save new member into database using CrudRepository included method
	public void save(Member member){
		memberRepo.save(member);
	}
			
	//delete member from the list
	public void delete(String studentid){
		memberRepo.delete(studentid);
	}
	
	//count how many members there are
	public int countMembers(){
		return (int) memberRepo.count();
	}
}
