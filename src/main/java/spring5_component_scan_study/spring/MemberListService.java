package spring5_component_scan_study.spring;

import java.util.Map;

public class MemberListService {
	private MemberDao memberDao;

	public MemberListService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

//	public Map<String, Member> selectAll() {
//	}
}
