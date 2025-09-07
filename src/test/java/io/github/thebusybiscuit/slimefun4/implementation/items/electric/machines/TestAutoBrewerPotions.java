package io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.Field;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.potion.PotionType;
import org.junit.jupiter.api.Test;

import io.github.thebusybiscuit.slimefun4.implementation.items.electric.machines.AutoBrewer;
import io.github.thebusybiscuit.slimefun4.utils.compatibility.VersionedPotionType;

class TestAutoBrewerPotions {

    @SuppressWarnings("unchecked")
    private Map<Material, PotionType> getPotionRecipes() throws Exception {
        Field field = AutoBrewer.class.getDeclaredField("potionRecipes");
        field.setAccessible(true);
        return (Map<Material, PotionType>) field.get(null);
    }

    @Test
    void testNewPotionRecipes() throws Exception {
        Map<Material, PotionType> recipes = getPotionRecipes();

        assertEquals(VersionedPotionType.OOZING, recipes.get(Material.SLIME_BLOCK));
        assertEquals(VersionedPotionType.WEAVING, recipes.get(Material.COBWEB));
        assertEquals(VersionedPotionType.INFESTED, recipes.get(Material.STONE));

        Material breezeRod = Material.matchMaterial("BREEZE_ROD");
        if (breezeRod != null) {
            assertEquals(VersionedPotionType.WIND_CHARGED, recipes.get(breezeRod));
        } else {
            assertNotNull(breezeRod, "BREEZE_ROD material should exist on 1.21");
        }
    }
}
