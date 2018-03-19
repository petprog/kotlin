/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.descriptors.Modality
import org.jetbrains.kotlin.descriptors.Visibility
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.declarations.FirProperty
import org.jetbrains.kotlin.fir.declarations.FirPropertyAccessor
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.types.FirType
import org.jetbrains.kotlin.name.Name

class FirMemberPropertyImpl(
    session: FirSession,
    psi: PsiElement?,
    name: Name,
    visibility: Visibility,
    modality: Modality,
    isOverride: Boolean,
    override val isConst: Boolean,
    receiverType: FirType?,
    returnType: FirType,
    override val isVar: Boolean,
    override val initializer: FirExpression?,
    override val getter: FirPropertyAccessor,
    override val setter: FirPropertyAccessor,
    override val delegate: FirExpression?
) : FirAbstractCallableMember(session, psi, name, visibility, modality, isOverride, receiverType, returnType),
    FirProperty