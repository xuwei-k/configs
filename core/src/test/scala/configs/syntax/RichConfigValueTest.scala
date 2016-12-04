/*
 * Copyright 2013-2016 Tsukasa Kitachi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package configs.syntax

import configs.ConfigValue
import configs.testutil.instance.config._
import configs.testutil.instance.string._
import scala.collection.JavaConverters._
import scalaprops.Property.forAll
import scalaprops.Scalaprops

object RichConfigValueTest extends Scalaprops {

  val withComments = forAll { (cl: ConfigValue, xs: List[String]) =>
    val wc: ConfigValue = cl.withComments(xs)
    wc.origin().comments() == xs.asJava
  }

}