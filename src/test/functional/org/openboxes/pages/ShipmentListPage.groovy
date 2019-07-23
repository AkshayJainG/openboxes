package org.openboxes.pages

import geb.Page
import testutils.TestFixture

class ShipmentListPage extends Page{
    static url = TestFixture.baseUrl +"/shipment/list"
    static content ={
        pendingItems { $("td.shipment-name").text()}
    }
}
