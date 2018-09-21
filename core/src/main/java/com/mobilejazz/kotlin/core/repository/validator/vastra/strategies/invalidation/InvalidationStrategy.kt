package com.mobilejazz.kotlin.core.repository.validator.vastra.strategies.invalidation

import com.mobilejazz.kotlin.core.repository.validator.vastra.strategies.ValidationStrategy
import com.mobilejazz.kotlin.core.repository.validator.vastra.strategies.ValidationStrategyDataSource
import com.mobilejazz.kotlin.core.repository.validator.vastra.strategies.ValidationStrategyResult

data class InvalidationStrategyDataSource(val isValid: Boolean) : ValidationStrategyDataSource

class InvalidationStrategy : ValidationStrategy {

  override fun <T : ValidationStrategyDataSource> isValid(t: T): ValidationStrategyResult {
    when (t) {
      is InvalidationStrategyDataSource -> {
        return if (!t.isValid) ValidationStrategyResult.INVALID else ValidationStrategyResult.UNKNOWN
      }
      else -> {
        throw IllegalArgumentException("object != InvalidationStrategyDataSource")
      }
    }
  }
}