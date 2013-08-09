package homework2;

import java.util.ArrayList;

/*
 * Class which holds all of the OpenInventor Data read in
 */
public class OpenInventorData {
	
	PerspectiveCameraData pcd;
	ArrayList<SeparatorData> sds = new ArrayList<SeparatorData>();
	
	public OpenInventorData(PerspectiveCameraData $pcd, ArrayList<SeparatorData> $sds) {
		pcd = $pcd;
		sds = $sds;
	}
	
}
