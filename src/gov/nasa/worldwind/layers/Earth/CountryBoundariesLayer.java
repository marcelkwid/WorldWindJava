/*
 * Copyright (C) 2012 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration.
 * All Rights Reserved.
 */
package gov.nasa.worldwind.layers.Earth;

import gov.nasa.worldwind.util.WWXML;
import gov.nasa.worldwind.wms.WMSTiledImageLayer;
import org.w3c.dom.Document;

/**
 * @author tag
 * @version $Id: CountryBoundariesLayer.java 1171 2013-02-11 21:45:02Z dcollins $
 */
public class CountryBoundariesLayer extends WMSTiledImageLayer {

    public CountryBoundariesLayer() {
        super(getConfigurationDocument(), null);
    }

    protected static Document getConfigurationDocument() {
        return WWXML.openDocumentFile("config/Earth/CountryBoundariesLayer.xml", null);
    }
}
