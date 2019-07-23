package org.openboxes.pages

import geb.Page
import testutils.TestFixture

class ViewOrdersPage extends Page {
    static url = TestFixture.baseUrl + "/order/list"
    static at = { title == "View orders"}
    static content = {
        selectOrderStatus { $("select[name='status']") }
        filterOrderButton { $("button", name:"filter") }
    }

}
