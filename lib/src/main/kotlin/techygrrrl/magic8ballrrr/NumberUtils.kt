package techygrrrl.magic8ballrrr

import java.security.SecureRandom

/**
 *  Uses [SecureRandom] with the default security provider [java.security.Provider]
 *  Constructs a secure random number generator (RNG) implementing the default random number algorithm.
 */
internal fun IntRange.secureRandom(seed: String? = null) =
    SecureRandom().apply {
        seed?.let {
            setSeed(seed.toByteArray())
        }
        nextBytes(ByteArray(20))
    }
    .nextInt((endInclusive + 1) - start) + start