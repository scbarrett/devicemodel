/*
Copyright (c) 2013 Robby, John Hatcliff, Kansas State University.        
All rights reserved. This program and the accompanying materials      
are made available under the terms of the Eclipse Public License v1.0 
which accompanies this distribution, and is available at              
http://www.eclipse.org/legal/epl-v10.html                             
*/

package edu.ksu.cis.santos.mdcf.dms.example.device

import edu.ksu.cis.santos.mdcf.dms._
import edu.ksu.cis.santos.mdcf.dms.example.schema.ClientInitiated
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEAlert
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEDataExchange
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEManufacturerModel
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICEPhysioParameter
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICEPulseOx
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICEPulseRate
import edu.ksu.cis.santos.mdcf.dms.example.schema.ICESecurity
import edu.ksu.cis.santos.mdcf.dms.example.clas.ICESpO2
import edu.ksu.cis.santos.mdcf.dms.example.schema.IntRange
import edu.ksu.cis.santos.mdcf.dms.example.DeviceId

class NoninPulseOx extends ICEPulseOx {
  override val id = DeviceId("Continua PO")

  override val manufacturerModel = new ICEManufacturerModel {
    override val modelNumber = String("Nonin Onyx II")
    override val versionNumber = String("XX.YY.ZZ")
    override val credentials = Set[ICESecurity]()
  }

  override val physioParams = Set[ICEPhysioParameter](
    new ICESpO2 {

      override val range = new IntRange {
        override val min = Int(0)
        override val max = Int(100)
      }

      override val exchanges = Set[ICEDataExchange](
        new ClientInitiated {
          override val maxRetrievalRatePerSecond = Nat(15)
        }
      )

      override val alerts = Set[ICEAlert]()
    },

    new ICEPulseRate {
      override val range = new IntRange {
        override val min = Int(20)
        override val max = Int(300)
      }

      override val exchanges = Set[ICEDataExchange](
        new ClientInitiated {
          override val maxRetrievalRatePerSecond = Nat(5)
        }
      )

      override val alerts = Set[ICEAlert]()
    }
  )
}