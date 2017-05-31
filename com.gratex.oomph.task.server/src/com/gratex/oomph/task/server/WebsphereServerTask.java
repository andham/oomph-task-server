/**
 */
package com.gratex.oomph.task.server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Websphere Server Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getBaseServerName <em>Base Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getProfilePath <em>Profile Path</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getBootstrapPort <em>Bootstrap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getIcpPort <em>Icp Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getSoapPort <em>Soap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsUser <em>Remote Os User</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsPassword <em>Remote Os Password</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WebsphereServerTask#getServerVersion <em>Server Version</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://gratex.github.io/oomph-task-server/repository/' installableUnits='com.gratex.oomph.task.server.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='STARTUP MANUAL'"
 * @generated
 */
public interface WebsphereServerTask extends Server
{
  /**
   * Returns the value of the '<em><b>Base Server Name</b></em>' attribute.
   * The default value is <code>"server1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Server Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Server Name</em>' attribute.
   * @see #setBaseServerName(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_BaseServerName()
   * @model default="server1" required="true"
   * @generated
   */
  String getBaseServerName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getBaseServerName <em>Base Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Server Name</em>' attribute.
   * @see #getBaseServerName()
   * @generated
   */
  void setBaseServerName(String value);

  /**
   * Returns the value of the '<em><b>Profile Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile Path</em>' attribute.
   * @see #setProfilePath(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_ProfilePath()
   * @model required="true"
   * @generated
   */
  String getProfilePath();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getProfilePath <em>Profile Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile Path</em>' attribute.
   * @see #getProfilePath()
   * @generated
   */
  void setProfilePath(String value);

  /**
   * Returns the value of the '<em><b>Bootstrap Port</b></em>' attribute.
   * The default value is <code>"2806"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bootstrap Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bootstrap Port</em>' attribute.
   * @see #setBootstrapPort(Integer)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_BootstrapPort()
   * @model default="2806" required="true"
   * @generated
   */
  Integer getBootstrapPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getBootstrapPort <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bootstrap Port</em>' attribute.
   * @see #getBootstrapPort()
   * @generated
   */
  void setBootstrapPort(Integer value);

  /**
   * Returns the value of the '<em><b>Icp Port</b></em>' attribute.
   * The default value is <code>"9633"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icp Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icp Port</em>' attribute.
   * @see #setIcpPort(Integer)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_IcpPort()
   * @model default="9633" required="true"
   * @generated
   */
  Integer getIcpPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getIcpPort <em>Icp Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icp Port</em>' attribute.
   * @see #getIcpPort()
   * @generated
   */
  void setIcpPort(Integer value);

  /**
   * Returns the value of the '<em><b>Soap Port</b></em>' attribute.
   * The default value is <code>"8880"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Soap Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Soap Port</em>' attribute.
   * @see #setSoapPort(Integer)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_SoapPort()
   * @model default="8880" required="true"
   * @generated
   */
  Integer getSoapPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getSoapPort <em>Soap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Soap Port</em>' attribute.
   * @see #getSoapPort()
   * @generated
   */
  void setSoapPort(Integer value);

  /**
   * Returns the value of the '<em><b>Remote Os User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Os User</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Os User</em>' attribute.
   * @see #setRemoteOsUser(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_RemoteOsUser()
   * @model required="true"
   * @generated
   */
  String getRemoteOsUser();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsUser <em>Remote Os User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Os User</em>' attribute.
   * @see #getRemoteOsUser()
   * @generated
   */
  void setRemoteOsUser(String value);

  /**
   * Returns the value of the '<em><b>Remote Os Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote Os Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote Os Password</em>' attribute.
   * @see #setRemoteOsPassword(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_RemoteOsPassword()
   * @model required="true"
   * @generated
   */
  String getRemoteOsPassword();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsPassword <em>Remote Os Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote Os Password</em>' attribute.
   * @see #getRemoteOsPassword()
   * @generated
   */
  void setRemoteOsPassword(String value);

  /**
   * Returns the value of the '<em><b>Server Version</b></em>' attribute.
   * The literals are from the enumeration {@link com.gratex.oomph.task.server.WebsphereServerVersion}.
   * <!-- begin-user-doc -->
  	 * <p>
  	 * If the meaning of the '<em>Server Version</em>' attribute isn't clear,
  	 * there really should be more of a description here...
  	 * </p>
  	 * <!-- end-user-doc -->
   * @return the value of the '<em>Server Version</em>' attribute.
   * @see com.gratex.oomph.task.server.WebsphereServerVersion
   * @see #setServerVersion(WebsphereServerVersion)
   * @see com.gratex.oomph.task.server.ServerPackage#getWebsphereServerTask_ServerVersion()
   * @model required="true"
   * @generated
   */
  WebsphereServerVersion getServerVersion();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WebsphereServerTask#getServerVersion <em>Server Version</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Version</em>' attribute.
   * @see com.gratex.oomph.task.server.WebsphereServerVersion
   * @see #getServerVersion()
   * @generated
   */
  void setServerVersion(WebsphereServerVersion value);

} // WebsphereServerTask
