package com.squareup.anvil.sample

import com.squareup.anvil.annotations.ContributesBinding
import com.squareup.anvil.sample.father.FatherProvider
import com.squareup.anvil.sample.mother.MotherProvider
import com.squareup.scopes.AppScope
import javax.inject.Inject

interface Parents {
}


@ContributesBinding(AppScope::class)
class RealParents @Inject constructor(
  private val fatherProvider: FatherProvider,
  // Line to comment or uncomment
  private val motherProvider: MotherProvider,
): Parents {

}
