/**
* Copyright (c) 2012 Partners In Health.  All rights reserved.
* The use and distribution terms for this software are covered by the
* Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
* which can be found in the file epl-v10.html at the root of this distribution.
* By using this software in any fashion, you are agreeing to be bound by
* the terms of this license.
* You must not remove this notice, or any other, from this software.
**/ 
package org.openboxes.user
import org.pih.warehouse.core.Location;

import grails.test.*
// import grails.converters.JSON

class DashboardControllerTests extends ControllerUnitTestCase {
	
	protected void setUp() {
		super.setUp()
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testIndex() {
		
		println controller
		println controller.redirectArgs
		
		//mockDomain(Item, [ new Item(name: "item1"), new Item(name: "item2")] )
		//def model = controller.list()
		//assertEquals 2, model.itemInstanceList.size()
		//mockDomain(Location, [new Location(id: 1, name: "Boston" ), new Location(id: 2, name: "Miami")])
		//def model = controller.list()		
		//assertEquals 2, model.locations.size()
		//assertEquals "list" model.view
	}




}