package com.cnss.pfe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cnss.pfe.persistance.dao.AssureDao;
import com.cnss.pfe.persistance.dao.AvantageAssureDao;
import com.cnss.pfe.persistance.dao.CodeExploitationDao;
import com.cnss.pfe.persistance.dao.EmployeurDao;
import com.cnss.pfe.persistance.dao.RegionDao;
import com.cnss.pfe.persistance.model.Assure;
import com.cnss.pfe.persistance.model.AvantageAssure;
import com.cnss.pfe.persistance.model.CodeExploitation;
import com.cnss.pfe.persistance.model.Employeur;
import com.cnss.pfe.persistance.model.Region;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(DemoApplication.class, args);
		
		//# Get bean for repo avantageAssure 
		AvantageAssureDao avantageAssureDao=ctx.getBean(AvantageAssureDao.class);
		
		//# Get bean for repo assure 
		AssureDao assureDao=ctx.getBean(AssureDao.class);
		
		
		//# Get bean for repo region 
		RegionDao regionDao=ctx.getBean(RegionDao.class);
		
		//# Get bean for repo employeur 
		EmployeurDao EmployeurDao=ctx.getBean(EmployeurDao.class);
		
		
		
		//# Get bean for repo codeExploitation 
		CodeExploitationDao codeExploitationDao=ctx.getBean(CodeExploitationDao.class);
		
		// Create AvantageAssure
		AvantageAssure avantageAssure = new AvantageAssure();
		avantageAssure.setCleAvantage(1);
		avantageAssure.setTaux(1.3F);
		avantageAssureDao.save(avantageAssure);
		// Create Assure
		
		Assure assure = new Assure();
		assure.setCleAssure(1);
		assure.setNumAssure(1233);
		assure.setStatut("XXXXX");
		assure.setPrenom("AAAAA");
		assure.setNom("BBBBB");
		assure.setAvantageAssures(avantageAssure);
		assureDao.save(assure);

		//Create codeExploitation 
		CodeExploitation  codeExploitation1 = new CodeExploitation();
		codeExploitation1.setCleExp(1);
		codeExploitation1.setTaux(1.3F);
		codeExploitation1.getAssures().add(assure);
		codeExploitationDao.save(codeExploitation1);
	
		CodeExploitation  codeExploitation2= new CodeExploitation();
		codeExploitation2.setCleExp(2);
		codeExploitation2.setTaux(1.3F);
		codeExploitationDao.save(codeExploitation2);

		
		CodeExploitation  codeExploitation3= new CodeExploitation();
		codeExploitation3.setCleExp(3);
		codeExploitation3.setTaux(1.3F);
		codeExploitationDao.save(codeExploitation3);
		
		CodeExploitation  codeExploitation4= new CodeExploitation();
		codeExploitation4.setCleExp(4);
		codeExploitation4.setTaux(1.3F);
		codeExploitationDao.save(codeExploitation4);

		
		
        //# Create Region tunis 
		Region regionTunis = new Region();
		regionTunis.setCleReg(1);
		regionTunis.setNomGouvernorat("Tunis");
		regionDao.save(regionTunis);
		
	    //# Create Region Benarous 
			Region regionBenarous = new Region();
			regionBenarous.setCleReg(2);
			regionBenarous.setNomGouvernorat("Benarous");
			regionDao.save(regionBenarous);

			
		    //# Create Region beja 
			Region regionBeja = new Region();
			regionBeja.setCleReg(3);
			regionBeja.setNomGouvernorat("Beja");
			regionDao.save(regionBeja);

		
		//# Add first employeur  ( you need to create a list  of valid region before  )
		Employeur empl1 = new Employeur();
		empl1.setCleEmp(22);
		empl1.setNom("Employeur1");
		empl1.setPrenom("Employeur1");
		empl1.setNumEmp(2637399);
		empl1.getCodeExploitations().add(codeExploitation1);
		empl1.getCodeExploitations().add(codeExploitation2);
		empl1.getCodeExploitations().add(codeExploitation3);


		empl1.getRegions().add(regionTunis);
		empl1.getRegions().add(regionBeja);
		empl1.getRegions().add(regionBenarous);
		EmployeurDao.save(empl1);
		
		Employeur empl2 = new Employeur();
		empl2.setCleEmp(23);
		empl2.setNom("Employeur2");
		empl2.setPrenom("Employeur2");
		empl2.setNumEmp(33566);
		empl2.getCodeExploitations().add(codeExploitation4);


		empl2.getRegions().add(regionTunis);
		EmployeurDao.save(empl2);

	

	}

}
