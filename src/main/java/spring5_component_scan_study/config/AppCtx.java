package spring5_component_scan_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_component_scan_study.spring.ChangePasswordService;
import spring5_component_scan_study.spring.MemberDao;
import spring5_component_scan_study.spring.MemberInfoPrinter;
import spring5_component_scan_study.spring.MemberListPrinter;
import spring5_component_scan_study.spring.MemberPrinter;
import spring5_component_scan_study.spring.MemberRegisterService;
import spring5_component_scan_study.spring.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"spring5_component_scan_study.spring"})
public class AppCtx {
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	
//	Component 붙였기때문에 없어도됨
//	@Bean
//	public MemberDao memberDao() {
//		return new MemberDao();
//	}
	
//	@Bean
//	public MemberPrinter memberPrinter() {
//		return new MemberPrinter();
//	}
	
//	@Bean
//	public MemberListPrinter memberListPrinter() {
//		return new MemberListPrinter(memberDao(), memberPrinter());
//	}
	
//	@Bean
//	public MemberRegisterService memberRegSvc() {
//		return new MemberRegisterService();
//	}
	
//	@Bean
//	public ChangePasswordService changePwdSvc() {
//		ChangePasswordService pwdSvc = new ChangePasswordService();
////		pwdSvc.setMemberDao(memberDao());
//		return pwdSvc;
//	}
	
//	@Bean
//	public MemberInfoPrinter infoPrinter() {
//		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
////		infoPrinter.setMemberDao(memberDao());
////		infoPrinter.setPrinter(memberPrinter());
//		return infoPrinter;
//	}
	
}
