/**
 */
package edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl;

import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.DeviceModelingLanguagePackage;
import edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.TypeDecl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl#getSupers <em>Supers</em>}</li>
 *   <li>{@link edu.ksu.cis.projects.mdcf.devicemodel.deviceModelingLanguage.impl.TypeDeclImpl#getElems <em>Elems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeclImpl extends DeclImpl implements TypeDecl
{
  /**
   * The cached value of the '{@link #getSupers() <em>Supers</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupers()
   * @generated
   * @ordered
   */
  protected EList<TypeDecl> supers;

  /**
   * The cached value of the '{@link #getElems() <em>Elems</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElems()
   * @generated
   * @ordered
   */
  protected EList<String> elems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDeclImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeviceModelingLanguagePackage.Literals.TYPE_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDecl> getSupers()
  {
    if (supers == null)
    {
      supers = new EObjectResolvingEList<TypeDecl>(TypeDecl.class, this, DeviceModelingLanguagePackage.TYPE_DECL__SUPERS);
    }
    return supers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getElems()
  {
    if (elems == null)
    {
      elems = new EDataTypeEList<String>(String.class, this, DeviceModelingLanguagePackage.TYPE_DECL__ELEMS);
    }
    return elems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DeviceModelingLanguagePackage.TYPE_DECL__SUPERS:
        return getSupers();
      case DeviceModelingLanguagePackage.TYPE_DECL__ELEMS:
        return getElems();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DeviceModelingLanguagePackage.TYPE_DECL__SUPERS:
        getSupers().clear();
        getSupers().addAll((Collection<? extends TypeDecl>)newValue);
        return;
      case DeviceModelingLanguagePackage.TYPE_DECL__ELEMS:
        getElems().clear();
        getElems().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DeviceModelingLanguagePackage.TYPE_DECL__SUPERS:
        getSupers().clear();
        return;
      case DeviceModelingLanguagePackage.TYPE_DECL__ELEMS:
        getElems().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DeviceModelingLanguagePackage.TYPE_DECL__SUPERS:
        return supers != null && !supers.isEmpty();
      case DeviceModelingLanguagePackage.TYPE_DECL__ELEMS:
        return elems != null && !elems.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (elems: ");
    result.append(elems);
    result.append(')');
    return result.toString();
  }

} //TypeDeclImpl
