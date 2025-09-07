package io.github.thebusybiscuit.slimefun4.utils;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEnchantment;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedEntityType;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedPotionEffectType;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedPotionType;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedItemFlag;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedParticle;

class TestVersionedCompatibility {

    @Test
    void testNewEntityTypes() {
        assertNotNull(VersionedEntityType.ARMADILLO);
        assertNotNull(VersionedEntityType.BOGGED);
        assertNotNull(VersionedEntityType.BREEZE);
        assertNotNull(VersionedEntityType.WIND_CHARGE);
        assertNotNull(VersionedEntityType.CREAKING);
    }

    @Test
    void testNewEnchantments() {
        assertNotNull(VersionedEnchantment.DENSITY);
        assertNotNull(VersionedEnchantment.BREACH);
        assertNotNull(VersionedEnchantment.WIND_BURST);
    }

    @Test
    void testNewPotionEffects() {
        assertNotNull(VersionedPotionEffectType.OOZING);
        assertNotNull(VersionedPotionEffectType.WEAVING);
        assertNotNull(VersionedPotionEffectType.WIND_CHARGED);
        assertNotNull(VersionedPotionEffectType.INFESTED);
    }

    @Test
    void testNewPotionTypes() {
        assertNotNull(VersionedPotionType.OOZING);
        assertNotNull(VersionedPotionType.WEAVING);
        assertNotNull(VersionedPotionType.WIND_CHARGED);
        assertNotNull(VersionedPotionType.INFESTED);
    }

    @Test
    void testNewItemFlag() {
        assertNotNull(VersionedItemFlag.HIDE_TOOLTIP);
    }

    @Test
    void testNewParticles() {
        assertNotNull(VersionedParticle.BREEZE_WIND);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_DETECTION);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_DETECTION_OMINOUS);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_EJECTION);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_EJECTION_OMINOUS);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_SMOKE);
        assertNotNull(VersionedParticle.TRIAL_SPAWNER_SMOKE_OMINOUS);
        assertNotNull(VersionedParticle.GUST);
        assertNotNull(VersionedParticle.SMALL_GUST);
        assertNotNull(VersionedParticle.GUST_EMITTER_LARGE);
        assertNotNull(VersionedParticle.GUST_EMITTER_SMALL);
    }
}
