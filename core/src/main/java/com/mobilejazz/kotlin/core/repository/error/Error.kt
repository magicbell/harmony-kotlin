package com.mobilejazz.kotlin.core.repository.error

// Errors

sealed class RepositoryException(override val message: String?, override val cause: Throwable?) : Throwable(message)

class DataNotFoundException(message: String? = "Data not found", cause: Throwable? = null) : RepositoryException(message, cause)

class DeleteModelFailException(message: String? = "Fail deleting model", cause: Throwable? = null) : RepositoryException(message, cause)

class PutModelFailException(message: String? = "Fail updating or inserting model", cause: Throwable? = null) : RepositoryException(message, cause)

class ObjectNotValidException(message: String? = "Object not valid", cause: Throwable? = null) : RepositoryException(message, cause)