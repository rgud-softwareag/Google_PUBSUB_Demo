

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class connector_services

{
	// ---( internal utility methods )---

	final static connector_services _instance = new connector_services();

	static connector_services _newInstance() { return new connector_services(); }

	static connector_services _cast(Object o) { return (connector_services)o; }

	// ---( server methods )---




	public static final void Java_service_sleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(Java_service_sleep)>> ---
		// @sigtype java 3.5
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}
}

