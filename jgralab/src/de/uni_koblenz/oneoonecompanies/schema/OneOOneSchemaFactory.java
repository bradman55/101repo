/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_koblenz.oneoonecompanies.schema;

import de.uni_koblenz.jgralab.impl.GraphFactoryImpl;

public class OneOOneSchemaFactory extends GraphFactoryImpl {

	public OneOOneSchemaFactory() {
		super();
		fillTable();
	}

	protected void fillTable() { 

		/* code for graph de.uni_koblenz.oneoonecompanies.schema.CompaniesGraph */
		setGraphImplementationClass(de.uni_koblenz.oneoonecompanies.schema.CompaniesGraph.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.CompaniesGraphImpl.class);

		setVertexImplementationClass(de.uni_koblenz.oneoonecompanies.schema.Manager.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.ManagerImpl.class);

		setVertexImplementationClass(de.uni_koblenz.oneoonecompanies.schema.Company.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.CompanyImpl.class);

		setVertexImplementationClass(de.uni_koblenz.oneoonecompanies.schema.Department.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.DepartmentImpl.class);

		setVertexImplementationClass(de.uni_koblenz.oneoonecompanies.schema.Employee.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.EmployeeImpl.class);

		setEdgeImplementationClass(de.uni_koblenz.oneoonecompanies.schema.HasEmployee.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.HasEmployeeImpl.class);

		setEdgeImplementationClass(de.uni_koblenz.oneoonecompanies.schema.HasDepartment.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.HasDepartmentImpl.class);

		setEdgeImplementationClass(de.uni_koblenz.oneoonecompanies.schema.HasSubDepartment.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.HasSubDepartmentImpl.class);

		setEdgeImplementationClass(de.uni_koblenz.oneoonecompanies.schema.Mentors.class, de.uni_koblenz.oneoonecompanies.schema.impl.std.MentorsImpl.class);

	}
}