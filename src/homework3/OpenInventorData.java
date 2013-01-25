package homework3;

import homework2.PerspectiveCameraData;

import java.util.ArrayList;

public class OpenInventorData {
	
	public PerspectiveCameraData pcd;
	public ArrayList<SeparatorData> sds = new ArrayList<SeparatorData>();
	public ArrayList<PointLightData> plds = new ArrayList<PointLightData>();
	
	public OpenInventorData(PerspectiveCameraData $pcd, ArrayList<SeparatorData> $sds, ArrayList<PointLightData> $plds) {
		pcd = $pcd;
		sds = $sds;
		plds = $plds;
	}
	
}
