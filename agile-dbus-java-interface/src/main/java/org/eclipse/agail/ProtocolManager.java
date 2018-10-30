/*******************************************************************************
 * Copyright (C) 2017 Create-Net / FBK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Create-Net / FBK - initial API and implementation
 ******************************************************************************/

package org.eclipse.agail;

import java.util.List;

import org.freedesktop.dbus.DBusInterface;
import org.freedesktop.dbus.DBusSignal;
import org.freedesktop.dbus.exceptions.DBusException;

import org.eclipse.agail.object.DeviceOverview;
import org.eclipse.agail.object.DiscoveryStatus;
import org.eclipse.agail.object.ProtocolOverview;

/**
 * @author dagi AGILE Protocol Manager Interface
 */
public interface ProtocolManager extends DBusInterface {

  public static String AGILE_INTERFACE = "org.eclipse.agail.ProtocolManager";

  /**
   *
   * @return List of devices returned by each protocol discovery method
   */
  @org.freedesktop.DBus.Description("Returns List of devices returned by each protocol discovery method")
  public List<DeviceOverview> Devices();

  /**
   *
   * @return List of supported/Managed protocols
   */
  @org.freedesktop.DBus.Description("Returns List of supported/Managed protocols")
  public List<ProtocolOverview> Protocols();

  /**
   * Discovery status on all managed protocols
   */
  @org.freedesktop.DBus.Description("Discovery status on all managed protocols")
  public List<DiscoveryStatus> DiscoveryStatus();


  /**
   * Starts device discovery on all managed protocols
   */
  @org.freedesktop.DBus.Description("Starts device discovery on all managed protocols")
  public void StartDiscovery();

  /**
   * Stops device discovery on all managed protocols
   */
  @org.freedesktop.DBus.Description("Stops device discovery on all managed protocols")
  public void StopDiscovery();

  /**
   * Adds a new protocol to the managed protocols list
   *
   * @param protocol
   *          the protocol to be added
   */
  @org.freedesktop.DBus.Description("Adds a new protocol to the managed protocols list")
  public void Add(String protocol);

  /**
   * Removes a protocol from the managed protocol list
   *
   * @param protocol
   *          the protocol to be removed
   */
  @org.freedesktop.DBus.Description("Removes a protocol from the managed protocol list")
  public void Remove(String protocol);

  /**
   * Found new device signal
   * @author dagi
   *
   */
  public class FoundNewDeviceSignal extends DBusSignal {
     public final DeviceOverview device;

    public FoundNewDeviceSignal(String path, DeviceOverview device) throws DBusException {
      super(path, device);
       this.device = device;
    }

  }

}
