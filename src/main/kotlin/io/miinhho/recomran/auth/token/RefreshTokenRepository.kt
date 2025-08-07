package io.miinhho.recomran.auth.token

import org.springframework.data.jpa.repository.JpaRepository

interface RefreshTokenRepository: JpaRepository<RefreshToken, Long> {
    fun findByUserIdAndHashedToken(userId: Long, hashedToken: String): RefreshToken?
    fun deleteByUserIdAndHashedToken(userId: Long, hashedToken: String)
}