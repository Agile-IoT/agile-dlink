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

import org.eclipse.agail.object.DeviceDefinition;
import org.eclipse.agail.object.DeviceOverview;

 /**
 * AGILE Device Manager Interface
 *
 * @author dagi
 *
 *
 *
 */
public interface DeviceManager extends DBusInterface {
  
  static String AGILE_INTERFACE = "org.eclipse.agail.DeviceManager";
  
  /**
   * Return all registered devices
   *
   * @return
   */
  @org.freedesktop.DBus.Description("Returns all registered devices")
  public List<DeviceDefinition> Devices();

  /**
   * search for devices based on specific criteria
   *
   * @return
   */
  @org.freedesktop.DBus.Description("Returns all registered devices")
  public String Find();

  /**
   * search for device types matching a specific device overview
   *
   * @return list of possible device types, if any
   */
  @org.freedesktop.DBus.Description("Returns all possible device types")
  public List<String> MatchingDeviceTypes(DeviceOverview deviceOverview);

  /**
   * Creates devices
   */
  @org.freedesktop.DBus.Description("Returns the registered device definition")
  public DeviceDefinition Register(DeviceOverview deviceOverview, String deviceType);

  /**
   * Load a device definition by its ID
   *
   * @param id
   */
  @org.freedesktop.DBus.Description("Load a device definition by its ID")
  public DeviceDefinition Read(String id);

  /**
   * UPdate a device definition by its ID
   *
   * @param id
   * @param definition
   * @return
   */
  @org.freedesktop.DBus.Description("Update a device definition by its ID")
  public void Update(String id, DeviceDefinition definition);

  /**
   * Delete a device definition by its ID. this will deactivate the Device DBus
   * object
   *
   * @param id
   * @param definition
   */
  @org.freedesktop.DBus.Description("Delete a device definition by its ID")
  public void Delete(String id);

  /**
   * Perform a batch operation over a set of devices
   *
   * @param operation
   * @param arguments
   * @return
   */
  @org.freedesktop.DBus.Description("Perform a batch operation")
  public void Batch(String operation, String arguments);

}
