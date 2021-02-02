package havis.device.rf.empty;

import havis.device.rf.RFConsumer;
import havis.device.rf.capabilities.RegulatoryCapabilities;
import havis.device.rf.common.HardwareManager;
import havis.device.rf.configuration.AntennaConfiguration;
import havis.device.rf.configuration.AntennaConfigurationList;
import havis.device.rf.configuration.AntennaPropertyList;
import havis.device.rf.configuration.ConnectType;
import havis.device.rf.configuration.RFRegion;
import havis.device.rf.configuration.RssiFilter;
import havis.device.rf.configuration.SingulationControl;
import havis.device.rf.exception.ConnectionException;
import havis.device.rf.exception.ImplementationException;
import havis.device.rf.exception.ParameterException;
import havis.device.rf.tag.Filter;
import havis.device.rf.tag.TagDataList;
import havis.device.rf.tag.operation.TagOperation;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class EmptyHardwareManager implements HardwareManager {
	
	private static final Logger log = Logger.getLogger(EmptyHardwareManager.class.getName());

	@Override
	public void closeConnection() throws ConnectionException {
		log.finer("closeConnection");
	}

	@Override
	public TagDataList execute(List<Short> arg0, List<Filter> arg1, List<TagOperation> arg2, RFConsumer arg3)
			throws ImplementationException, ParameterException {
		log.finer("execute");
		throw new ParameterException("Execute failed: empty reader will never report any tags");
	}

	@Override
	public AntennaPropertyList getAntennaProperties(Map<Short, ConnectType> arg0) throws ImplementationException {
		log.finer("getAntennaProperties");
		return new AntennaPropertyList();
	}

	@Override
	public String getFirmwareVersion() throws ImplementationException {
		log.finer("getFirmwareVersion");
		return "Unknown";
	}

	@Override
	public int getMaxAntennas() throws ImplementationException {
		log.finer("getMaxAntennas");
		return 0;
	}

	@Override
	public String getRegion() {
		log.finer("getRegion");
		return "Unspecified";
	}

	@Override
	public RssiFilter getRssiFilter() {
		log.finer("getRssiFilter");
		return new RssiFilter();
	}

	@Override
	public SingulationControl getSingulationControl() {
		log.finer("getSingulationControl");
		return new SingulationControl();
	}

	@Override
	public void installFirmware() throws ImplementationException {
		log.finer("installFirmware");
	}

	@Override
	public void openConnection() throws ConnectionException, ImplementationException {
		log.finer("openConnection");
	}

	@Override
	public void setAntennaConfiguration(AntennaConfiguration arg0, RegulatoryCapabilities arg1, boolean arg2) throws ParameterException,
			ImplementationException {
		log.finer("setAntennaConfiguration");
	}

	@Override
	public void setRegion(RFRegion arg0, AntennaConfigurationList arg1) throws ParameterException, ImplementationException {
		log.finer("setRegion");
	}

	@Override
	public void setRssiFilter(RssiFilter arg0) throws ImplementationException {
		log.finer("setRssiFilter");
	}

	@Override
	public void setSingulationControl(SingulationControl arg0) throws ImplementationException {
		log.finer("setSingulationControl");
	}

}
