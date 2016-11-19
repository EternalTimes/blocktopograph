package com.protolambda.blocktopograph.map;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.util.SparseArray;

import com.protolambda.blocktopograph.util.NamedBitmapProvider;
import com.protolambda.blocktopograph.util.NamedBitmapProviderHandle;
import com.protolambda.blocktopograph.util.Color;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by protolambda
 *
 * ==========================
 * POCKET EDITION BLOCKS ONLY
 * ==========================
 *
 * uvs are up to date with MCPE 0.14.0
 *
 --- Please attribute @protolambda for generating+updating this enum
 */
public enum Block implements NamedBitmapProviderHandle, NamedBitmapProvider {

  /*
   * ==============================
   *       Blocks
   * ==============================
   */

    B_0_0_AIR("air", null, 0, 0, null, 0x00000000, false),
    B_1_0_STONE("stone", "stone", 1, 0, "blocks/stone.png", 0xff464646, false),
    B_1_1_STONE_GRANITE("stone", "granite", 1, 1, "blocks/stone_granite.png", 0xff8c7167, false),
    B_1_2_STONE_GRANITE_SMOOTH("stone", "granite_smooth", 1, 2, "blocks/stone_granite_smooth.png", 0xff946251, false),
    B_1_3_STONE_DIORITE("stone", "diorite", 1, 3, "blocks/stone_diorite.png", 0xffc6c6c6, false),
    B_1_4_STONE_DIORITE_SMOOTH("stone", "diorite_smooth", 1, 4, "blocks/stone_diorite_smooth.png", 0xffbebec1, false),
    B_1_5_STONE_ANDESITE("stone", "andesite", 1, 5, "blocks/stone_andesite.png", 0xff797777, false),
    B_1_6_STONE_ANDESITE_SMOOTH("stone", "andesite_smooth", 1, 6, "blocks/stone_andesite_smooth.png", 0xff828382, false),
    B_2_0_GRASS("grass", null, 2, 0, "blocks/grass_side_carried.png", 0xff939393, true),
    B_3_0_DIRT("dirt", null, 3, 0, "blocks/dirt.png", 0xff866043, true),
    B_4_0_COBBLESTONE("cobblestone", null, 4, 0, "blocks/cobblestone.png", 0xff7a7a7a, false),
    B_5_0_PLANKS_OAK("planks", "oak", 5, 0, "blocks/planks_oak.png", 0xff9c7f4e, false),
    B_5_1_PLANKS_SPRUCE("planks", "spruce", 5, 1, "blocks/planks_spruce.png", 0xff674d2e, false),
    B_5_2_PLANKS_BIRCH("planks", "birch", 5, 2, "blocks/planks_birch.png", 0xffc3b37b, false),
    B_5_3_PLANKS_JUNGLE("planks", "jungle", 5, 3, "blocks/planks_jungle.png", 0xff9a6e4d, false),
    B_5_4_PLANKS_ACACIA("planks", "acacia", 5, 4, "blocks/planks_acacia.png", 0xffaa5a2f, false),
    B_5_5_PLANKS_BIG_OAK("planks", "big_oak", 5, 5, "blocks/planks_big_oak.png", 0xff3b260f, false),
    B_6_0_SAPLING_OAK("sapling", "oak", 6, 0, "blocks/sapling_oak.png", 0x6b476625, false),
    B_6_1_SAPLING_SPRUCE("sapling", "spruce", 6, 1, "blocks/sapling_spruce.png", 0x53333a21, false),
    B_6_2_SAPLING_BIRCH("sapling", "birch", 6, 2, "blocks/sapling_birch.png", 0x6b769654, false),
    B_6_3_SAPLING_JUNGLE("sapling", "jungle", 6, 3, "blocks/sapling_jungle.png", 0x55305612, false),
    B_6_4_SAPLING_ACACIA("sapling", "acacia", 6, 4, "blocks/sapling_acacia.png", 0xff718919, false),
    B_6_5_SAPLING_BIG_OAK("sapling", "big_oak", 6, 5, "blocks/sapling_roofed_oak.png", 0xff6f522d, false),
    B_7_0_BEDROCK("bedrock", null, 7, 0, "blocks/bedrock.png", 0xff535353, false),
    B_8_0_FLOWING_WATER("flowing_water", null, 8, 0, "blocks/water_flow.png", 0x802e43f4, false),
    B_9_0_WATER("water", null, 9, 0, "blocks/water_still.png", 0x802e43f4, false),
    B_10_0_FLOWING_LAVA("flowing_lava", null, 10, 0, "blocks/lava_flow.png", 0xf0d45a12, false),
    B_11_0_LAVA("lava", null, 11, 0, "blocks/lava_still.png", 0xf0d45a12, false),
    B_12_0_SAND_DEFAULT("sand", "default", 12, 0, "blocks/sand.png", 0xffdbd3a0, false),
    B_12_1_SAND_RED("sand", "red", 12, 1, "blocks/red_sand.png", 0xffa7531f, false),
    B_13_0_GRAVEL("gravel", null, 13, 0, "blocks/gravel.png", 0xff7e7c7a, false),
    B_14_0_GOLD_ORE("gold_ore", null, 14, 0, "blocks/gold_ore.png", 0xff8f8b7c, false),
    B_15_0_IRON_ORE("iron_ore", null, 15, 0, "blocks/iron_ore.png", 0xff87827e, false),
    B_16_0_COAL_ORE("coal_ore", null, 16, 0, "blocks/coal_ore.png", 0xff737373, false),
    B_17_0_LOG_OAK("log", "oak", 17, 0, "blocks/log_oak.png", 0xff9a7d4d, false),
    B_17_1_LOG_SPRUCE("log", "spruce", 17, 1, "blocks/log_spruce.png", 0xff9a7d4d, false),
    B_17_2_LOG_BIRCH("log", "birch", 17, 2, "blocks/log_birch.png", 0xff9a7d4d, false),
    B_17_3_LOG_JUNGLE("log", "jungle", 17, 3, "blocks/log_jungle.png", 0xff9a7d4d, false),
    B_18_0_LEAVES_OAK("leaves", "oak", 18, 0, "blocks/leaves_oak.png", 0xff878787, true),
    B_18_1_LEAVES_SPRUCE("leaves", "spruce", 18, 1, "blocks/leaves_spruce.png", 0xff132613, true),
    B_18_2_LEAVES_BIRCH("leaves", "birch", 18, 2, "blocks/leaves_birch.png", 0xff283816, true),
    B_18_3_LEAVES_JUNGLE("leaves", "jungle", 18, 3, "blocks/leaves_jungle.png", 0xff918e86, true),
    B_19_0_SPONGE_DRY("sponge", "dry", 19, 0, "blocks/sponge_dry.png", 0xffb6b639, false),
    B_19_1_SPONGE_WET("sponge", "wet", 19, 1, "blocks/sponge_wet.png", 0xff9b9a33, false),
    B_20_0_GLASS("glass", null, 20, 0, "blocks/glass.png", 0x46daf0f4, false),
    B_21_0_LAPIS_ORE("lapis_ore", null, 21, 0, "blocks/lapis_ore.png", 0xff667086, false),
    B_22_0_LAPIS_BLOCK("lapis_block", null, 22, 0, "blocks/lapis_block.png", 0xff1d47a5, false),
    B_23_0_DISPENSER("dispenser", null, 23, 0, "blocks/dispenser.png", 0xff606060, false),
    B_24_0_SANDSTONE_DEFAULT("sandstone", "default", 24, 0, "blocks/sandstone_default.png", 0xffdad29e, false),
    B_24_1_SANDSTONE_CHISELED("sandstone", "chiseled", 24, 1, "blocks/sandstone_chiseled.png", 0xffdad1a2, false),
    B_24_2_SANDSTONE_SMOOTH("sandstone", "smooth", 24, 2, "blocks/sandstone_smooth.png", 0xffdad1a2, false),
    B_25_0_NOTEBLOCK("noteblock", null, 25, 0, "blocks/noteblock.png", 0xff644332, false),
    B_26_0_BED("bed", null, 26, 0, "blocks/bed.png", 0xff8e1616, false),
    B_27_0_GOLDEN_RAIL("golden_rail", null, 27, 0, "blocks/golden_rail.png", 0xab9a6846, false),
    B_28_0_DETECTOR_RAIL("detector_rail", null, 28, 0, "blocks/detector_rail.png", 0x9b786559, false),
    B_29_0_STICKY_PISTON("sticky_piston", null, 29, 0, "blocks/sticky_piston.png", 0xff8d9263, false),
    B_30_0_WEB("web", null, 30, 0, "blocks/web.png", 0x68dcdcdc, false),
    B_31_1_TALLGRASS_FERN("tallgrass", "fern", 31, 1, "blocks/tallgrass_fern.png", 0xff747474, true),
    B_31_2_TALLGRASS_GRASS("tallgrass", "grass", 31, 2, "blocks/tallgrass_grass.png", 0x4e787878, true),
    B_32_0_DEADBUSH("deadbush", null, 32, 0, "blocks/deadbush.png", 0x517b4f19, false),
    B_33_0_PISTON("piston", null, 33, 0, "blocks/piston.png", 0xff998159, false),
    B_34_0_PISTONARMCOLLISION("pistonArmCollision", null, 34, 0, "blocks/pistonArmCollision.png", 0xff9c7f4e, false),
    B_35_0_WOOL_WHITE("wool", "white", 35, 0, "blocks/wool_colored_white.png", 0xffdddddd, false),
    B_35_1_WOOL_ORANGE("wool", "orange", 35, 1, "blocks/wool_colored_orange.png", 0xffdb7d3e, false),
    B_35_2_WOOL_MAGENTA("wool", "magenta", 35, 2, "blocks/wool_colored_magenta.png", 0xffb350bc, false),
    B_35_3_WOOL_LIGHT_BLUE("wool", "light_blue", 35, 3, "blocks/wool_colored_light_blue.png", 0xff6a8ac9, false),
    B_35_4_WOOL_YELLOW("wool", "yellow", 35, 4, "blocks/wool_colored_yellow.png", 0xffb1a627, false),
    B_35_5_WOOL_LIME("wool", "lime", 35, 5, "blocks/wool_colored_lime.png", 0xff41ae38, false),
    B_35_6_WOOL_PINK("wool", "pink", 35, 6, "blocks/wool_colored_pink.png", 0xffd08499, false),
    B_35_7_WOOL_GRAY("wool", "gray", 35, 7, "blocks/wool_colored_gray.png", 0xff404040, false),
    B_35_8_WOOL_SILVER("wool", "silver", 35, 8, "blocks/wool_colored_silver.png", 0xff9aa1a1, false),
    B_35_9_WOOL_CYAN("wool", "cyan", 35, 9, "blocks/wool_colored_cyan.png", 0xff2e6e89, false),
    B_35_10_WOOL_PURPLE("wool", "purple", 35, 10, "blocks/wool_colored_purple.png", 0xff7e3db5, false),
    B_35_11_WOOL_BLUE("wool", "blue", 35, 11, "blocks/wool_colored_blue.png", 0xff2e388d, false),
    B_35_12_WOOL_BROWN("wool", "brown", 35, 12, "blocks/wool_colored_brown.png", 0xff4f321f, false),
    B_35_13_WOOL_GREEN("wool", "green", 35, 13, "blocks/wool_colored_green.png", 0xff35461b, false),
    B_35_14_WOOL_RED("wool", "red", 35, 14, "blocks/wool_colored_red.png", 0xff963430, false),
    B_35_15_WOOL_BLACK("wool", "black", 35, 15, "blocks/wool_colored_black.png", 0xff191616, false),
    B_37_0_YELLOW_FLOWER("yellow_flower", null, 37, 0, "blocks/yellow_flower.png", 0x1e6ca200, false),
    B_38_0_RED_FLOWER_POPPY("red_flower", "poppy", 38, 0, "blocks/flower_poppy.png", 0x1d8a2b0d, false),
    B_38_1_RED_FLOWER_BLUE_ORCHID("red_flower", "blue_orchid", 38, 1, "blocks/flower_blue_orchid.png", 0x1d188fd3, false),
    B_38_2_RED_FLOWER_ALLIUM("red_flower", "allium", 38, 2, "blocks/flower_allium.png", 0x1ddbb7f8, false),
    B_38_3_RED_FLOWER_HOUSTONIA("red_flower", "houstonia", 38, 3, "blocks/flower_houstonia.png", 0x1defef99, false),
    B_38_4_RED_FLOWER_TULIP_RED("red_flower", "tulip_red", 38, 4, "blocks/flower_tulip_red.png", 0x1dbd2604, false),
    B_38_5_RED_FLOWER_TULIP_ORANGE("red_flower", "tulip_orange", 38, 5, "blocks/flower_tulip_orange.png", 0x1dd06713, false),
    B_38_6_RED_FLOWER_TULIP_WHITE("red_flower", "tulip_white", 38, 6, "blocks/flower_tulip_white.png", 0x1df9f9f9, false),
    B_38_7_RED_FLOWER_TULIP_PINK("red_flower", "tulip_pink", 38, 7, "blocks/flower_tulip_pink.png", 0x1dbeb3be, false),
    B_38_8_RED_FLOWER_OXEYE_DAISY("red_flower", "oxeye_daisy", 38, 8, "blocks/flower_oxeye_daisy.png", 0x1ddadada, false),
    B_39_0_BROWN_MUSHROOM("brown_mushroom", null, 39, 0, "blocks/brown_mushroom.png", 0x198a6953, false),
    B_40_0_RED_MUSHROOM("red_mushroom", null, 40, 0, "blocks/red_mushroom.png", 0x21c33538, false),
    B_41_0_GOLD_BLOCK("gold_block", null, 41, 0, "blocks/gold_block.png", 0xfff9ec4e, false),
    B_42_0_IRON_BLOCK("iron_block", null, 42, 0, "blocks/iron_block.png", 0xffdbdbdb, false),
    B_43_0_DOUBLE_STONE_SLAB_STONE("double_stone_slab", "stone", 43, 0, "blocks/double_stone_slab_stone.png", 0xff9f9f9f, false),
    B_43_1_DOUBLE_STONE_SLAB_SAND("double_stone_slab", "sand", 43, 1, "blocks/double_stone_slab_sand.png", 0xffdad29e, false),
    B_43_2_DOUBLE_STONE_SLAB_WOOD("double_stone_slab", "wood", 43, 2, "blocks/double_stone_slab_wood.png", 0xff9c7f4e, false),
    B_43_3_DOUBLE_STONE_SLAB_COBBLE("double_stone_slab", "cobble", 43, 3, "blocks/double_stone_slab_cobble.png", 0xff7a7a7a, false),
    B_43_4_DOUBLE_STONE_SLAB_BRICK("double_stone_slab", "brick", 43, 4, "blocks/double_stone_slab_brick.png", 0xff926356, false),
    B_43_5_DOUBLE_STONE_SLAB_SMOOTH_STONE_BRICK("double_stone_slab", "smooth_stone_brick", 43, 5, "blocks/double_stone_slab_smooth_stone_brick.png", 0xff7d7d7d, false),
    B_43_6_DOUBLE_STONE_SLAB_QUARTZ("double_stone_slab", "quartz", 43, 6, "blocks/double_stone_slab_quartz.png", 0xff2c161a, false),
    B_43_7_DOUBLE_STONE_SLAB_NETHER_BRICK("double_stone_slab", "nether_brick", 43, 7, "blocks/double_stone_slab_nether_brick.png", 0xffece9e2, false),
    B_43_8_DOUBLE_STONE_SLAB_RED_SANDSTONE("double_stone_slab", "red_sandstone", 43, 8, "blocks/double_stone_slab_red_sandstone.png", 0xff9f9f9f, false),
    B_44_0_STONE_SLAB_STONE("stone_slab", "stone", 44, 0, "blocks/stone_slab_side.png", 0xff9f9f9f, false),
    B_44_1_STONE_SLAB_SAND("stone_slab", "sand", 44, 1, "blocks/stone_slab_side.png", 0xffdad29e, false),
    B_44_2_STONE_SLAB_WOOD("stone_slab", "wood", 44, 2, "blocks/stone_slab_side.png", 0xff9c7f4e, false),
    B_44_3_STONE_SLAB_COBBLE("stone_slab", "cobble", 44, 3, "blocks/stone_slab_side.png", 0xff7a7a7a, false),
    B_44_4_STONE_SLAB_BRICK("stone_slab", "brick", 44, 4, "blocks/stone_slab_side.png", 0xff926356, false),
    B_44_5_STONE_SLAB_SMOOTH_STONE_BRICK("stone_slab", "smooth_stone_brick", 44, 5, "blocks/stone_slab_side.png", 0xff7d7d7d, false),
    B_44_6_STONE_SLAB_QUARTZ("stone_slab", "quartz", 44, 6, "blocks/stone_slab_side.png", 0xff2c161a, false),
    B_44_7_STONE_SLAB_NETHER_BRICK("stone_slab", "nether_brick", 44, 7, "blocks/stone_slab_side.png", 0xffece9e2, false),
    B_45_0_BRICK_BLOCK("brick_block", null, 45, 0, "blocks/brick_block.png", 0xff926356, false),
    B_46_0_TNT("tnt", null, 46, 0, "blocks/tnt.png", 0xff82412f, false),
    B_47_0_BOOKSHELF("bookshelf", null, 47, 0, "blocks/bookshelf.png", 0xff6b5839, false),
    B_48_0_MOSSY_COBBLESTONE("mossy_cobblestone", null, 48, 0, "blocks/mossy_cobblestone.png", 0xff677967, false),
    B_49_0_OBSIDIAN("obsidian", null, 49, 0, "blocks/obsidian.png", 0xff14121d, false),
    B_50_0_TORCH("torch", null, 50, 0, "blocks/torch.png", 0x13826a3a, false),
    B_51_0_FIRE("fire", null, 51, 0, "blocks/fire.png", 0x8bd38c35, false),
    B_52_0_MOB_SPAWNER("mob_spawner", null, 52, 0, "blocks/mob_spawner.png", 0x9b1a2731, false),
    B_53_0_OAK_STAIRS("oak_stairs", null, 53, 0, "blocks/oak_stairs.png", 0xff9c7f4e, false),
    B_54_0_CHEST("chest", null, 54, 0, "blocks/chest_front.png", 0xc86f5739, false),
    B_55_0_REDSTONE_WIRE("redstone_wire", null, 55, 0, "blocks/redstone_wire.png", 0x80fa1010, false),
    B_56_0_DIAMOND_ORE("diamond_ore", null, 56, 0, "blocks/diamond_ore.png", 0xff818c8f, false),
    B_57_0_DIAMOND_BLOCK("diamond_block", null, 57, 0, "blocks/diamond_block.png", 0xff61dbd5, false),
    B_58_0_CRAFTING_TABLE("crafting_table", null, 58, 0, "blocks/crafting_table.png", 0xff6b472a, false),
    B_59_0_WHEAT("wheat", null, 59, 0, "blocks/wheat.png", 0x0500b312, false),
    B_60_0_FARMLAND("farmland", null, 60, 0, "blocks/farmland.png", 0xff734b2d, false),
    B_61_0_FURNACE("furnace", null, 61, 0, "blocks/furnace.png", 0xff606060, false),
    B_62_0_LIT_FURNACE("lit_furnace", null, 62, 0, "blocks/lit_furnace.png", 0xff606060, false),
    B_63_0_STANDING_SIGN("standing_sign", null, 63, 0, "blocks/standing_sign.png", 0x566f5739, false),
    B_64_0_WOODEN_DOOR("wooden_door", null, 64, 0, "blocks/wooden_door.png", 0xcf866733, false),
    B_65_0_LADDER("ladder", null, 65, 0, "blocks/ladder.png", 0x8f795f34, false),
    B_66_0_RAIL("rail", null, 66, 0, "blocks/rail.png", 0x8f796c58, false),
    B_67_0_STONE_STAIRS("stone_stairs", null, 67, 0, "blocks/stone_stairs.png", 0xff7a7a7a, false),
    B_68_0_WALL_SIGN("wall_sign", null, 68, 0, "blocks/wall_sign.png", 0x206f5739, false),
    B_69_0_LEVER("lever", null, 69, 0, "blocks/lever.png", 0x136a5940, false),
    B_70_0_STONE_PRESSURE_PLATE("stone_pressure_plate", null, 70, 0, "blocks/stone_pressure_plate.png", 0xff7d7d7d, false),
    B_71_0_IRON_DOOR("iron_door", null, 71, 0, "blocks/iron_door.png", 0xcfbababa, false),
    B_72_0_WOODEN_PRESSURE_PLATE("wooden_pressure_plate", null, 72, 0, "blocks/wooden_pressure_plate.png", 0xff9c7f4e, false),
    B_73_0_REDSTONE_ORE("redstone_ore", null, 73, 0, "blocks/redstone_ore.png", 0xff846b6b, false),
    B_74_0_LIT_REDSTONE_ORE("lit_redstone_ore", null, 74, 0, "blocks/lit_redstone_ore.png", 0xff846b6b, false),
    B_75_0_UNLIT_REDSTONE_TORCH("unlit_redstone_torch", null, 75, 0, "blocks/unlit_redstone_torch.png", 0x465d3e26, false),
    B_76_0_REDSTONE_TORCH("redstone_torch", null, 76, 0, "blocks/redstone_torch.png", 0x46a74b29, false),
    B_77_0_STONE_BUTTON("stone_button", null, 77, 0, "blocks/stone_button.png", 0x28565656, false),
    B_78_0_SNOW_LAYER("snow_layer", null, 78, 0, "blocks/snow_layer.png", 0xffeffbfb, false),
    B_79_0_ICE("ice", null, 79, 0, "blocks/ice.png", 0x9f7dadff, false),
    B_80_0_SNOW("snow", null, 80, 0, "blocks/snow.png", 0xffeffbfb, false),
    B_81_0_CACTUS("cactus", null, 81, 0, "blocks/cactus.png", 0xc30d6318, false),
    B_82_0_CLAY("clay", null, 82, 0, "blocks/clay.png", 0xff9ea4b0, false),
    B_83_0_REEDS("reeds", null, 83, 0, "blocks/reeds.png", 0x8c94c065, false),
    B_85_0_FENCE_FENCE("fence", "fence", 85, 0, "blocks/fence_fence.png", 0x8f463822, false),
    B_85_1_FENCE_SPRUCE_FENCE("fence", "spruce_fence", 85, 1, "blocks/fence_spruce_fence.png", 0x8f463822, false),
    B_85_2_FENCE_BIRCH_FENCE("fence", "birch_fence", 85, 2, "blocks/fence_birch_fence.png", 0x8f463822, false),
    B_85_3_FENCE_JUNGLE_FENCE("fence", "jungle_fence", 85, 3, "blocks/fence_jungle_fence.png", 0x8f463822, false),
    B_85_4_FENCE_ACACIA_FENCE("fence", "acacia_fence", 85, 4, "blocks/fence_acacia_fence.png", 0x8f463822, false),
    B_85_5_FENCE_DARK_OAK_FENCE("fence", "dark_oak_fence", 85, 5, "blocks/fence_dark_oak_fence.png", 0x8f463822, false),
    B_86_0_PUMPKIN("pumpkin", null, 86, 0, "blocks/pumpkin.png", 0xffc07615, false),
    B_87_0_NETHERRACK("netherrack", null, 87, 0, "blocks/netherrack.png", 0xff6f3634, false),
    B_88_0_SOUL_SAND("soul_sand", null, 88, 0, "blocks/soul_sand.png", 0xff544033, false),
    B_89_0_GLOWSTONE("glowstone", null, 89, 0, "blocks/glowstone.png", 0xff8f7645, false),
    B_90_0_PORTAL("portal", null, 90, 0, "blocks/portal.png", 0xc8410491, false),
    B_91_0_LIT_PUMPKIN("lit_pumpkin", null, 91, 0, "blocks/lit_pumpkin.png", 0xffc07615, false),
    B_92_0_CAKE("cake", null, 92, 0, "blocks/cake.png", 0xc3e4cdce, false),
    B_93_0_UNPOWERED_REPEATER("unpowered_repeater", null, 93, 0, "blocks/unpowered_repeater.png", 0xff979393, false),
    B_94_0_POWERED_REPEATER("powered_repeater", null, 94, 0, "blocks/powered_repeater.png", 0xffa09393, false),
    B_95_0_INVISIBLEBEDROCK("invisibleBedrock", null, 95, 0, "blocks/invisibleBedrock.png", 0x3c282828, false),
    B_96_0_TRAPDOOR("trapdoor", null, 96, 0, "blocks/trapdoor.png", 0xdb7e5d2d, false),
    B_97_0_MONSTER_EGG_STONE("monster_egg", "stone", 97, 0, "blocks/monster_egg_stone.png", 0xff7d7d7d, false),
    B_97_1_MONSTER_EGG_COBBLE("monster_egg", "cobble", 97, 1, "blocks/monster_egg_cobble.png", 0xff7a7a7a, false),
    B_97_2_MONSTER_EGG_BRICK("monster_egg", "brick", 97, 2, "blocks/monster_egg_brick.png", 0xff7a7a7a, false),
    B_97_3_MONSTER_EGG_MOSSYBRICK("monster_egg", "mossybrick", 97, 3, "blocks/monster_egg_mossybrick.png", 0xff7b6651, false),
    B_97_4_MONSTER_EGG_CRACKEDBRICK("monster_egg", "crackedbrick", 97, 4, "blocks/monster_egg_crackedbrick.png", 0xff7b6651, false),
    B_97_5_MONSTER_EGG_CHISELEDBRICK("monster_egg", "chiseledbrick", 97, 5, "blocks/monster_egg_chiseledbrick.png", 0xff7b6651, false),
    B_98_0_STONEBRICK_DEFAULT("stonebrick", "default", 98, 0, "blocks/stonebrick_default.png", 0xff7a7a7a, false),
    B_98_1_STONEBRICK_MOSSY("stonebrick", "mossy", 98, 1, "blocks/stonebrick_mossy.png", 0xff72776a, false),
    B_98_2_STONEBRICK_CRACKED("stonebrick", "cracked", 98, 2, "blocks/stonebrick_cracked.png", 0xff767676, false),
    B_98_3_STONEBRICK_CHISELED("stonebrick", "chiseled", 98, 3, "blocks/stonebrick_chiseled.png", 0xff767676, false),
    B_98_4_STONEBRICK_SMOOTH("stonebrick", "smooth", 98, 4, "blocks/stonebrick_smooth.png", 0xff767676, false),
    B_99_0_BROWN_MUSHROOM_BLOCK("brown_mushroom_block", null, 99, 0, "blocks/brown_mushroom_block.png", 0xff8d6a53, false),
    B_100_0_RED_MUSHROOM_BLOCK("red_mushroom_block", null, 100, 0, "blocks/red_mushroom_block.png", 0xffb62524, false),
    B_101_0_IRON_BARS("iron_bars", null, 101, 0, "blocks/iron_bars.png", 0x736d6c6a, false),
    B_102_0_GLASS_PANE("glass_pane", null, 102, 0, "blocks/glass_pane.png", 0x1fd3eff4, false),
    B_103_0_MELON_BLOCK("melon_block", null, 103, 0, "blocks/melon_block.png", 0xff979924, false),
    B_104_0_PUMPKIN_STEM("pumpkin_stem", null, 104, 0, "blocks/pumpkin_stem.png", 0x1e87b759, false),
    B_105_0_MELON_STEM("melon_stem", null, 105, 0, "blocks/melon_stem.png", 0x1e87b759, false),
    B_106_0_VINE("vine", null, 106, 0, "blocks/vine.png", 0x8a6f6f6f, false),
    B_107_0_FENCE_GATE("fence_gate", null, 107, 0, "blocks/fence_gate.png", 0x7b463822, false),
    B_108_0_BRICK_STAIRS("brick_stairs", null, 108, 0, "blocks/brick_stairs.png", 0xff926356, false),
    B_109_0_STONE_BRICK_STAIRS("stone_brick_stairs", null, 109, 0, "blocks/stone_brick_stairs.png", 0xff7a7a7a, false),
    B_110_0_MYCELIUM("mycelium", null, 110, 0, "blocks/mycelium.png", 0xff6f6369, false),
    B_111_0_WATERLILY("waterlily", null, 111, 0, "blocks/waterlily.png", 0x93335a21, false),
    B_112_0_NETHER_BRICK("nether_brick", null, 112, 0, "blocks/nether_brick.png", 0xff2c161a, false),
    B_113_0_NETHER_BRICK_FENCE("nether_brick_fence", null, 113, 0, "blocks/nether_brick_fence.png", 0xff2c161a, false),
    B_114_0_NETHER_BRICK_STAIRS("nether_brick_stairs", null, 114, 0, "blocks/nether_brick_stairs.png", 0xff2c161a, false),
    B_115_0_NETHER_WART("nether_wart", null, 115, 0, "blocks/nether_wart.png", 0x2a6a0e1e, false),
    B_116_0_ENCHANTING_TABLE("enchanting_table", null, 116, 0, "blocks/enchanting_table.png", 0xff67403b, false),
    B_117_0_BREWING_STAND("brewing_stand", null, 117, 0, "blocks/brewing_stand.png", 0x767c6751, false),
    B_118_0_CAULDRON("cauldron", null, 118, 0, "blocks/cauldron.png", 0xff373737, false),
    B_119_0_END_PORTAL("end_portal", null, 119, 0, "blocks/endframe_top.png", 0xff101010, false),
    B_120_0_END_PORTAL_FRAME("end_portal_frame", null, 120, 0, "blocks/endframe_side.png", 0xff597560, false),
    B_121_0_END_STONE("end_stone", null, 121, 0, "blocks/end_stone.png", 0xffdddfa5, false),
    B_122_0_DRAGON_EGG("dragon_egg", null, 122, 0, "blocks/dragon_egg.png", 0xff0c090f, false),
    B_123_0_REDSTONE_LAMP("redstone_lamp", null, 123, 0, "blocks/redstone_lamp.png", 0xff462b1a, false),
    B_124_0_LIT_REDSTONE_LAMP("lit_redstone_lamp", null, 124, 0, "blocks/lit_redstone_lamp.png", 0xff775937, false),
    B_125_0_DROPPER("dropper", null, 125, 0, "blocks/dropper.png", 0xff9c7f4e, false),
    B_126_0_ACTIVATOR_RAIL("activator_rail", null, 126, 0, "blocks/activator_rail.png", 0xff9c7f4e, false),
    B_127_0_COCOA("cocoa", null, 127, 0, "blocks/cocoa.png", 0x2e8a8c40, false),
    B_128_0_SANDSTONE_STAIRS("sandstone_stairs", null, 128, 0, "blocks/sandstone_stairs.png", 0xffdad29e, false),
    B_129_0_EMERALD_ORE("emerald_ore", null, 129, 0, "blocks/emerald_ore.png", 0xff6d8074, false),
    B_130_0_ENDER_CHEST("ender_chest", null, 130, 0, "blocks/ender_chest_front.png", 0xc82c3e40, false),
    B_131_0_TRIPWIRE_HOOK("tripwire_hook", null, 131, 0, "blocks/tripwire_hook.png", 0x2d8a8171, false),
    B_132_0_TRIPWIRE("tripWire", null, 132, 0, "blocks/tripWire.png", 0x2d818181, false),
    B_133_0_EMERALD_BLOCK("emerald_block", null, 133, 0, "blocks/emerald_block.png", 0xff51d975, false),
    B_134_0_SPRUCE_STAIRS("spruce_stairs", null, 134, 0, "blocks/spruce_stairs.png", 0xff674d2e, false),
    B_135_0_BIRCH_STAIRS("birch_stairs", null, 135, 0, "blocks/birch_stairs.png", 0xffc3b37b, false),
    B_136_0_JUNGLE_STAIRS("jungle_stairs", null, 136, 0, "blocks/jungle_stairs.png", 0xff9a6e4d, false),
    B_138_0_BEACON("beacon", null, 138, 0, "blocks/beacon.png", 0xff74ddd7, false),
    B_139_0_COBBLESTONE_WALL_NORMAL("cobblestone_wall", "normal", 139, 0, "blocks/cobblestone_wall_normal.png", 0xff7a7a7a, false),
    B_139_1_COBBLESTONE_WALL_MOSSY("cobblestone_wall", "mossy", 139, 1, "blocks/cobblestone_wall_mossy.png", 0xff506a50, false),
    B_140_0_FLOWER_POT("flower_pot", null, 140, 0, "blocks/flower_pot.png", 0x31764133, false),
    B_141_0_CARROTS("carrots", null, 141, 0, "blocks/carrots.png", 0x0901ab10, false),
    B_142_0_POTATOES("potatoes", null, 142, 0, "blocks/potatoes.png", 0x0901ab10, false),
    B_143_0_WOODEN_BUTTON("wooden_button", null, 143, 0, "blocks/wooden_button.png", 0x2878613e, false),
    B_144_0_SKULL("skull", null, 144, 0, "blocks/skull.png", 0x8c8c8c8c, false),
    B_145_0_ANVIL_INTACT("anvil", "intact", 145, 0, "blocks/anvil_intact.png", 0x9f403c3c, false),
    B_145_4_ANVIL_SLIGHTLY_DAMAGED("anvil", "slightly_damaged", 145, 4, "blocks/anvil_slightly_damaged.png", 0x9f403c3c, false),
    B_145_8_ANVIL_VERY_DAMAGED("anvil", "very_damaged", 145, 8, "blocks/anvil_very_damaged.png", 0x9f403c3c, false),
    B_146_0_TRAPPED_CHEST("trapped_chest", null, 146, 0, "blocks/chest_front.png", 0xfe6f5739, false),
    B_147_0_LIGHT_WEIGHTED_PRESSURE_PLATE("light_weighted_pressure_plate", null, 147, 0, "blocks/light_weighted_pressure_plate.png", 0xc8f9ec4e, false),
    B_148_0_HEAVY_WEIGHTED_PRESSURE_PLATE("heavy_weighted_pressure_plate", null, 148, 0, "blocks/heavy_weighted_pressure_plate.png", 0xc8dbdbdb, false),
    B_149_0_UNPOWERED_COMPARATOR("unpowered_comparator", null, 149, 0, "blocks/unpowered_comparator.png", 0xff9c9695, false),
    B_150_0_POWERED_COMPARATOR("powered_comparator", null, 150, 0, "blocks/powered_comparator.png", 0xffa59594, false),
    B_151_0_DAYLIGHT_DETECTOR("daylight_detector", null, 151, 0, "blocks/daylight_detector.png", 0xff82745e, false),
    B_152_0_REDSTONE_BLOCK("redstone_block", null, 152, 0, "blocks/redstone_block.png", 0xffab1b09, false),
    B_153_0_QUARTZ_ORE("quartz_ore", null, 153, 0, "blocks/quartz_ore.png", 0xffd9d1c8, false),
    B_154_0_HOPPER("hopper", null, 154, 0, "blocks/hopper.png", 0xff3e3e3e, false),
    B_155_0_QUARTZ_BLOCK_DEFAULT("quartz_block", "default", 155, 0, "blocks/quartz_block_default.png", 0xffece9e2, false),
    B_155_1_QUARTZ_BLOCK_CHISELED("quartz_block", "chiseled", 155, 1, "blocks/quartz_block_chiseled.png", 0xffe7e4db, false),
    B_155_2_QUARTZ_BLOCK_LINES("quartz_block", "lines", 155, 2, "blocks/quartz_block_lines.png", 0xffe8e5dd, false),
    B_155_3_QUARTZ_BLOCK_DEFAULT("quartz_block", "default", 155, 3, "blocks/quartz_block_default.png", 0xffe7e3db, false),
    B_156_0_QUARTZ_STAIRS("quartz_stairs", null, 156, 0, "blocks/quartz_stairs.png", 0xffece9e2, false),
    B_157_0_DOUBLE_WOODEN_SLAB_OAK("double_wooden_slab", "oak", 157, 0, "blocks/planks_oak.png", 0xb4907449, false),
    B_157_1_DOUBLE_WOODEN_SLAB_SPRUCE("double_wooden_slab", "spruce", 157, 1, "blocks/planks_spruce.png", 0xb4907449, false),
    B_157_2_DOUBLE_WOODEN_SLAB_BIRCH("double_wooden_slab", "birch", 157, 2, "blocks/planks_birch.png", 0xb4907449, false),
    B_157_3_DOUBLE_WOODEN_SLAB_JUNGLE("double_wooden_slab", "jungle", 157, 3, "blocks/planks_jungle.png", 0xb4907449, false),
    B_157_4_DOUBLE_WOODEN_SLAB_ACACIA("double_wooden_slab", "acacia", 157, 4, "blocks/planks_acacia.png", 0xb4907449, false),
    B_157_5_DOUBLE_WOODEN_SLAB_BIG_OAK("double_wooden_slab", "big_oak", 157, 5, "blocks/planks_big_oak.png", 0xb4907449, false),
    B_158_0_WOODEN_SLAB_OAK("wooden_slab", "oak", 158, 0, "blocks/wooden_slab_oak.png", 0xff907449, false),
    B_158_1_WOODEN_SLAB_SPRUCE("wooden_slab", "spruce", 158, 1, "blocks/wooden_slab_spruce.png", 0xff907449, false),
    B_158_2_WOODEN_SLAB_BIRCH("wooden_slab", "birch", 158, 2, "blocks/wooden_slab_birch.png", 0xff907449, false),
    B_158_3_WOODEN_SLAB_JUNGLE("wooden_slab", "jungle", 158, 3, "blocks/wooden_slab_jungle.png", 0xff907449, false),
    B_158_4_WOODEN_SLAB_ACACIA("wooden_slab", "acacia", 158, 4, "blocks/wooden_slab_acacia.png", 0xff907449, false),
    B_158_5_WOODEN_SLAB_BIG_OAK("wooden_slab", "big_oak", 158, 5, "blocks/wooden_slab_big_oak.png", 0xff907449, false),
    B_159_0_STAINED_HARDENED_CLAY_WHITE("stained_hardened_clay", "white", 159, 0, "blocks/hardened_clay_stained_white.png", 0xff836f64, false),
    B_159_1_STAINED_HARDENED_CLAY_ORANGE("stained_hardened_clay", "orange", 159, 1, "blocks/hardened_clay_stained_orange.png", 0xff9d5021, false),
    B_159_2_STAINED_HARDENED_CLAY_MAGENTA("stained_hardened_clay", "magenta", 159, 2, "blocks/hardened_clay_stained_magenta.png", 0xff915369, false),
    B_159_3_STAINED_HARDENED_CLAY_LIGHT_BLUE("stained_hardened_clay", "light_blue", 159, 3, "blocks/hardened_clay_stained_light_blue.png", 0xff706b87, false),
    B_159_4_STAINED_HARDENED_CLAY_YELLOW("stained_hardened_clay", "yellow", 159, 4, "blocks/hardened_clay_stained_yellow.png", 0xffb5801f, false),
    B_159_5_STAINED_HARDENED_CLAY_LIME("stained_hardened_clay", "lime", 159, 5, "blocks/hardened_clay_stained_lime.png", 0xff617030, false),
    B_159_6_STAINED_HARDENED_CLAY_PINK("stained_hardened_clay", "pink", 159, 6, "blocks/hardened_clay_stained_pink.png", 0xff9c4848, false),
    B_159_7_STAINED_HARDENED_CLAY_GRAY("stained_hardened_clay", "gray", 159, 7, "blocks/hardened_clay_stained_gray.png", 0xff392721, false),
    B_159_8_STAINED_HARDENED_CLAY_SILVER("stained_hardened_clay", "silver", 159, 8, "blocks/hardened_clay_stained_silver.png", 0xff81655b, false),
    B_159_9_STAINED_HARDENED_CLAY_CYAN("stained_hardened_clay", "cyan", 159, 9, "blocks/hardened_clay_stained_cyan.png", 0xff565959, false),
    B_159_10_STAINED_HARDENED_CLAY_PURPLE("stained_hardened_clay", "purple", 159, 10, "blocks/hardened_clay_stained_purple.png", 0xff744555, false),
    B_159_11_STAINED_HARDENED_CLAY_BLUE("stained_hardened_clay", "blue", 159, 11, "blocks/hardened_clay_stained_blue.png", 0xff463857, false),
    B_159_12_STAINED_HARDENED_CLAY_BROWN("stained_hardened_clay", "brown", 159, 12, "blocks/hardened_clay_stained_brown.png", 0xff492e1f, false),
    B_159_13_STAINED_HARDENED_CLAY_GREEN("stained_hardened_clay", "green", 159, 13, "blocks/hardened_clay_stained_green.png", 0xff484f26, false),
    B_159_14_STAINED_HARDENED_CLAY_RED("stained_hardened_clay", "red", 159, 14, "blocks/hardened_clay_stained_red.png", 0xffff382b, false),
    B_159_15_STAINED_HARDENED_CLAY_BLACK("stained_hardened_clay", "black", 159, 15, "blocks/hardened_clay_stained_black.png", 0xff21120d, false),
    B_160_0_STAINED_GLASS_PANE_WHITE("stained_glass_pane", "white", 160, 0, "blocks/glass.png", 0x32141414, false),
    B_160_1_STAINED_GLASS_PANE_ORANGE("stained_glass_pane", "orange", 160, 1, "blocks/glass.png", 0x209d5021, false),
    B_160_2_STAINED_GLASS_PANE_MAGENTA("stained_glass_pane", "magenta", 160, 2, "blocks/glass.png", 0x20915369, false),
    B_160_3_STAINED_GLASS_PANE_LIGHT_BLUE("stained_glass_pane", "light_blue", 160, 3, "blocks/glass.png", 0x20706b87, false),
    B_160_4_STAINED_GLASS_PANE_YELLOW("stained_glass_pane", "yellow", 160, 4, "blocks/glass.png", 0x20b5801f, false),
    B_160_5_STAINED_GLASS_PANE_LIME("stained_glass_pane", "lime", 160, 5, "blocks/glass.png", 0x20617030, false),
    B_160_6_STAINED_GLASS_PANE_PINK("stained_glass_pane", "pink", 160, 6, "blocks/glass.png", 0x209c4848, false),
    B_160_7_STAINED_GLASS_PANE_GRAY("stained_glass_pane", "gray", 160, 7, "blocks/glass.png", 0x20392721, false),
    B_160_8_STAINED_GLASS_PANE_SILVER("stained_glass_pane", "silver", 160, 8, "blocks/glass.png", 0x2081655b, false),
    B_160_9_STAINED_GLASS_PANE_CYAN("stained_glass_pane", "cyan", 160, 9, "blocks/glass.png", 0x20565959, false),
    B_160_10_STAINED_GLASS_PANE_PURPLE("stained_glass_pane", "purple", 160, 10, "blocks/glass.png", 0x20744555, false),
    B_160_11_STAINED_GLASS_PANE_BLUE("stained_glass_pane", "blue", 160, 11, "blocks/glass.png", 0x20463857, false),
    B_160_12_STAINED_GLASS_PANE_BROWN("stained_glass_pane", "brown", 160, 12, "blocks/glass.png", 0x20492e1f, false),
    B_160_13_STAINED_GLASS_PANE_GREEN("stained_glass_pane", "green", 160, 13, "blocks/glass.png", 0x20484f26, false),
    B_160_14_STAINED_GLASS_PANE_RED("stained_glass_pane", "red", 160, 14, "blocks/glass.png", 0x20ff382b, false),
    B_160_15_STAINED_GLASS_PANE_BLACK("stained_glass_pane", "black", 160, 15, "blocks/glass.png", 0x2021120d, false),
    B_161_0_LEAVES2_ACACIA("leaves2", "acacia", 161, 0, "blocks/leaves2_acacia.png", 0xff2e780c, true),
    B_161_1_LEAVES2_BIG_OAK("leaves2", "big_oak", 161, 1, "blocks/leaves2_big_oak.png", 0xff878787, true),
    B_162_0_LOG2_ACACIA("log2", "acacia", 162, 0, "blocks/log2_acacia.png", 0xff433f39, false),
    B_162_1_LOG2_BIG_OAK("log2", "big_oak", 162, 1, "blocks/log2_big_oak.png", 0xff2d2213, false),
    B_163_0_ACACIA_STAIRS("acacia_stairs", null, 163, 0, "blocks/acacia_stairs.png", 0xffa95c33, false),
    B_164_0_DARK_OAK_STAIRS("dark_oak_stairs", null, 164, 0, "blocks/dark_oak_stairs.png", 0xff3f2913, false),
    B_165_0_SLIME("slime", null, 165, 0, "blocks/slime.png", 0xc880b672, false),
    B_167_0_IRON_TRAPDOOR("iron_trapdoor", null, 167, 0, "blocks/iron_trapdoor.png", 0xb4cccccc, false),
    B_168_0_PRISMARINE_ROUGH("prismarine", "rough", 168, 0, "blocks/prismarine_rough.png", 0xff426a64, false),
    B_168_1_PRISMARINE_DARK("prismarine", "dark", 168, 1, "blocks/prismarine_dark.png", 0xff577a73, false),
    B_168_2_PRISMARINE_BRICKS("prismarine", "bricks", 168, 2, "blocks/prismarine_bricks.png", 0xff2f483e, false),
    B_169_0_SEALANTERN("seaLantern", null, 169, 0, "blocks/seaLantern.png", 0xffe0eae4, false),
    B_170_0_HAY_BLOCK("hay_block", null, 170, 0, "blocks/hay_block.png", 0xffa3870e, false),
    B_171_0_CARPET_WHITE("carpet", "white", 171, 0, "blocks/carpet_white.png", 0xffdddddd, false),
    B_171_1_CARPET_ORANGE("carpet", "orange", 171, 1, "blocks/carpet_orange.png", 0xffdb7d3e, false),
    B_171_2_CARPET_MAGENTA("carpet", "magenta", 171, 2, "blocks/carpet_magenta.png", 0xffb350bc, false),
    B_171_3_CARPET_LIGHT_BLUE("carpet", "light_blue", 171, 3, "blocks/carpet_light_blue.png", 0xff6a8ac9, false),
    B_171_4_CARPET_YELLOW("carpet", "yellow", 171, 4, "blocks/carpet_yellow.png", 0xffb1a627, false),
    B_171_5_CARPET_LIME("carpet", "lime", 171, 5, "blocks/carpet_lime.png", 0xff41ae38, false),
    B_171_6_CARPET_PINK("carpet", "pink", 171, 6, "blocks/carpet_pink.png", 0xffd08499, false),
    B_171_7_CARPET_GRAY("carpet", "gray", 171, 7, "blocks/carpet_gray.png", 0xff404040, false),
    B_171_8_CARPET_SILVER("carpet", "silver", 171, 8, "blocks/carpet_silver.png", 0xff9aa1a1, false),
    B_171_9_CARPET_CYAN("carpet", "cyan", 171, 9, "blocks/carpet_cyan.png", 0xff2e6e89, false),
    B_171_10_CARPET_PURPLE("carpet", "purple", 171, 10, "blocks/carpet_purple.png", 0xff7e3db5, false),
    B_171_11_CARPET_BLUE("carpet", "blue", 171, 11, "blocks/carpet_blue.png", 0xff2e388d, false),
    B_171_12_CARPET_BROWN("carpet", "brown", 171, 12, "blocks/carpet_brown.png", 0xff4f321f, false),
    B_171_13_CARPET_GREEN("carpet", "green", 171, 13, "blocks/carpet_green.png", 0xff35461b, false),
    B_171_14_CARPET_RED("carpet", "red", 171, 14, "blocks/carpet_red.png", 0xff963430, false),
    B_171_15_CARPET_BLACK("carpet", "black", 171, 15, "blocks/carpet_black.png", 0xff191616, false),
    B_172_0_HARDENED_CLAY("hardened_clay", null, 172, 0, "blocks/hardened_clay.png", 0xff5d3828, false),
    B_173_0_COAL_BLOCK("coal_block", null, 173, 0, "blocks/coal_block.png", 0xff111111, false),
    B_174_0_PACKED_ICE("packed_ice", null, 174, 0, "blocks/packed_ice.png", 0xff97b3e4, false),
    B_175_0_DOUBLE_PLANT_SUNFLOWER("double_plant", "sunflower", 175, 0, "blocks/double_plant_sunflower.png", 0xb4d28219, false),
    B_175_1_DOUBLE_PLANT_SYRINGA("double_plant", "syringa", 175, 1, "blocks/double_plant_syringa.png", 0xb4dec0e2, false),
    B_175_2_DOUBLE_PLANT_GRASS("double_plant", "grass", 175, 2, "blocks/double_plant_grass.png", 0xb4334e2c, false),
    B_175_3_DOUBLE_PLANT_FERN("double_plant", "fern", 175, 3, "blocks/double_plant_fern.png", 0xb43d5d34, false),
    B_175_4_DOUBLE_PLANT_ROSE("double_plant", "rose", 175, 4, "blocks/double_plant_rose.png", 0xb4d10609, false),
    B_175_5_DOUBLE_PLANT_PAEONIA("double_plant", "paeonia", 175, 5, "blocks/double_plant_paeonia.png", 0xb4d6c1df, false),
    B_178_0_DAYLIGHT_DETECTOR_INVERTED("daylight_detector_inverted", null, 178, 0, "blocks/daylight_detector_inverted.png", 0xffd8c9b5, false),
    B_179_0_RED_SANDSTONE_DEFAULT("red_sandstone", "default", 179, 0, "blocks/red_sandstone_default.png", 0xffaa561e, false),
    B_179_1_RED_SANDSTONE_CHISELED("red_sandstone", "chiseled", 179, 1, "blocks/red_sandstone_chiseled.png", 0xffa8551e, false),
    B_179_2_RED_SANDSTONE_SMOOTH("red_sandstone", "smooth", 179, 2, "blocks/red_sandstone_smooth.png", 0xffcc5e16, false),
    B_180_0_RED_SANDSTONE_STAIRS("red_sandstone_stairs", null, 180, 0, "blocks/red_sandstone_stairs.png", 0xffaa561e, false),
    B_181_0_DOUBLE_STONE_SLAB2_RED_SANDSTONE("double_stone_slab2", "red_sandstone", 181, 0, "blocks/double_stone_slab2_red_sandstone.png", 0xffaa561e, false),
    B_181_1_DOUBLE_STONE_SLAB2_PURPUR("double_stone_slab2", "purpur", 181, 1, "blocks/double_stone_slab2_purpur.png", 0xffa072a0, false),
    B_182_0_STONE_SLAB2_RED_SANDSTONE("stone_slab2", "red_sandstone", 182, 0, "blocks/stone_slab2_red_sandstone.png", 0xffaa561e, false),
    B_182_1_STONE_SLAB2_PURPUR("stone_slab2", "purpur", 182, 1, "blocks/stone_slab2_purpur.png", 0xffa072a0, false),
    B_183_0_SPRUCE_FENCE_GATE("spruce_fence_gate", null, 183, 0, "blocks/spruce_fence_gate.png", 0x00000000, false),
    B_184_0_BIRCH_FENCE_GATE("birch_fence_gate", null, 184, 0, "blocks/birch_fence_gate.png", 0x00000000, false),
    B_185_0_JUNGLE_FENCE_GATE("jungle_fence_gate", null, 185, 0, "blocks/jungle_fence_gate.png", 0x00000000, false),
    B_186_0_DARK_OAK_FENCE_GATE("dark_oak_fence_gate", null, 186, 0, "blocks/dark_oak_fence_gate.png", 0x00000000, false),
    B_187_0_ACACIA_FENCE_GATE("acacia_fence_gate", null, 187, 0, "blocks/acacia_fence_gate.png", 0x00000000, false),
    B_193_0_SPRUCE_DOOR("spruce_door", null, 193, 0, "blocks/spruce_door.png", 0x00000000, false),
    B_194_0_BIRCH_DOOR("birch_door", null, 194, 0, "blocks/birch_door.png", 0x00000000, false),
    B_195_0_JUNGLE_DOOR("jungle_door", null, 195, 0, "blocks/jungle_door.png", 0x00000000, false),
    B_196_0_ACACIA_DOOR("acacia_door", null, 196, 0, "blocks/acacia_door.png", 0x00000000, false),
    B_197_0_DARK_OAK_DOOR("dark_oak_door", null, 197, 0, "blocks/dark_oak_door.png", 0x00000000, false),
    B_198_0_GRASS_PATH("grass_path", null, 198, 0, "blocks/grass_path.png", 0x46a0a0a0, false),
    B_199_0_FRAME("frame", null, 199, 0, "blocks/frame.png", 0xa04f3e4f, false),
    B_200_0_CHORUS_FLOWER("chorus_flower", null, 200, 0, "blocks/chorus_flower.png", 0xa0c3b6c8, false),
    B_201_0_PURPUR_BLOCK_DEFAULT("purpur_block", "default", 201, 0, "blocks/purpur_block_default.png", 0xffa577a5, false),
    B_201_1_PURPUR_BLOCK_CHISELED("purpur_block", "chiseled", 201, 1, "blocks/purpur_block_chiseled.png", 0xffa570a5, false),
    B_201_2_PURPUR_BLOCK_LINES("purpur_block", "lines", 201, 2, "blocks/purpur_block_lines.png", 0xffa070a5, false),
    B_201_3_PURPUR_BLOCK_DEFAULT("purpur_block", "default", 201, 3, "blocks/purpur_block_default.png", 0xffa577a5, false),
    B_203_0_PURPUR_STAIRS("purpur_stairs", null, 203, 0, "blocks/purpur_stairs.png", 0xffa577a5, false),
    B_206_0_END_BRICKS("end_bricks", null, 206, 0, "blocks/end_bricks.png", 0xffe7f2af, false),
    B_208_0_END_ROD("end_rod", null, 208, 0, "blocks/end_rod.png", 0xff6e6e6e, true),
    B_209_0_END_GATEWAY("end_gateway", null, 209, 0, "blocks/end_gateway.png", 0xff171c27, false),
    B_240_0_CHORUS_PLANT("chorus_plant", null, 240, 0, "blocks/chorus_plant.png", 0xaa3d6e86, false),
    B_241_0_STAINED_GLASS_WHITE("stained_glass", "white", 241, 0, "blocks/stained_glass_white.png", 0x50836f64, false),
    B_241_1_STAINED_GLASS_ORANGE("stained_glass", "orange", 241, 1, "blocks/stained_glass_orange.png", 0x509d5021, false),
    B_241_2_STAINED_GLASS_MAGENTA("stained_glass", "magenta", 241, 2, "blocks/stained_glass_magenta.png", 0x50915369, false),
    B_241_3_STAINED_GLASS_LIGHT_BLUE("stained_glass", "light_blue", 241, 3, "blocks/stained_glass_light_blue.png", 0x50706b87, false),
    B_241_4_STAINED_GLASS_YELLOW("stained_glass", "yellow", 241, 4, "blocks/stained_glass_yellow.png", 0x50b5801f, false),
    B_241_5_STAINED_GLASS_LIME("stained_glass", "lime", 241, 5, "blocks/stained_glass_lime.png", 0x50617030, false),
    B_241_6_STAINED_GLASS_PINK("stained_glass", "pink", 241, 6, "blocks/stained_glass_pink.png", 0x509c4848, false),
    B_241_7_STAINED_GLASS_GRAY("stained_glass", "gray", 241, 7, "blocks/stained_glass_gray.png", 0x50392721, false),
    B_241_8_STAINED_GLASS_SILVER("stained_glass", "silver", 241, 8, "blocks/stained_glass_silver.png", 0x5081655b, false),
    B_241_9_STAINED_GLASS_CYAN("stained_glass", "cyan", 241, 9, "blocks/stained_glass_cyan.png", 0x50565959, false),
    B_241_10_STAINED_GLASS_PURPLE("stained_glass", "purple", 241, 10, "blocks/stained_glass_purple.png", 0x50744555, false),
    B_241_11_STAINED_GLASS_BLUE("stained_glass", "blue", 241, 11, "blocks/stained_glass_blue.png", 0x50463857, false),
    B_241_12_STAINED_GLASS_BROWN("stained_glass", "brown", 241, 12, "blocks/stained_glass_brown.png", 0x50492e1f, false),
    B_241_13_STAINED_GLASS_GREEN("stained_glass", "green", 241, 13, "blocks/stained_glass_green.png", 0x50484f26, false),
    B_241_14_STAINED_GLASS_RED("stained_glass", "red", 241, 14, "blocks/stained_glass_red.png", 0x50ff382b, false),
    B_241_15_STAINED_GLASS_BLACK("stained_glass", "black", 241, 15, "blocks/stained_glass_black.png", 0x5021120d, false),
    B_243_0_PODZOL("podzol", null, 243, 0, "blocks/podzol.png", 0xff533a1b, true),
    B_244_0_BEETROOT("beetroot", null, 244, 0, "blocks/beetroot.png", 0x0901ab10, false),
    B_245_0_STONECUTTER("stonecutter", null, 245, 0, "blocks/stonecutter.png", 0xff515151, false),
    B_246_0_GLOWINGOBSIDIAN("glowingobsidian", null, 246, 0, "blocks/glowingobsidian.png", 0xff17060a, false),
    B_247_0_NETHERREACTOR_DEFAULT("netherreactor", "default", 247, 0, "blocks/netherreactor_default.png", 0xffd2d200, false),
    B_247_1_NETHERREACTOR_ACTIVE("netherreactor", "active", 247, 1, "blocks/netherreactor_active.png", 0xff3d6e86, false),
    B_247_2_NETHERREACTOR_COOLED("netherreactor", "cooled", 247, 2, "blocks/netherreactor_cooled.png", 0xff3d6e86, false),
    B_248_0_INFO_UPDATE("info_update", null, 248, 0, "blocks/info_update.png", 0xff2f3218, false),
    B_249_0_INFO_UPDATE2("info_update2", null, 249, 0, "blocks/info_update2.png", 0xff2f3218, false),
    B_250_0_MOVINGBLOCK("movingBlock", null, 250, 0, "blocks/movingBlock.png", 0, false),
    B_251_0_OBSERVER("observer", null, 251, 0, "blocks/observer.png", 0xff3d6e86, false),
    B_255_0_RESERVED6("reserved6", null, 255, 0, "blocks/reserved6.png", 0xff19171a, false),
    B_210_0_ALLOW("allow", null, 210, 0, "blocks/allow.png", 0xff634aba, false),
    B_211_0_DENY("deny", null, 211, 0, "blocks/deny.png", 0xff6ca28a, false),
    B_212_0_BORDER_BLOCK("border_block", null, 212, 0, "blocks/border_block.png", 0xff76a7fc, false),
    B_230_0_CHALKBOARD("chalkboard", null, 230, 0, "blocks/chalkboard.png", 0xff3d6e86, false),
    B_242_0_CAMERA("camera", null, 242, 0, "blocks/camera.png", 0xff3d6e86, false),






  /*
   * ==============================
   *        Items
   * ==============================
   */

    I_256_0_IRON_SHOVEL("iron_shovel", null, 256, 0, "items/iron_shovel.png"),
    I_257_0_IRON_PICKAXE("iron_pickaxe", null, 257, 0, "items/iron_pickaxe.png"),
    I_258_0_IRON_AXE("iron_axe", null, 258, 0, "items/iron_axe.png"),
    I_259_0_FLINT_AND_STEEL("flint_and_steel", null, 259, 0, "items/flint_and_steel.png"),
    I_260_0_APPLE("apple", null, 260, 0, "items/apple.png"),
    I_261_0_BOW("bow", null, 261, 0, "items/bow.png"),
    I_262_0_ARROW("arrow", null, 262, 0, "items/arrow.png"),
    I_263_0_COAL_COAL("coal", "coal", 263, 0, "items/coal_coal.png"),
    I_263_1_COAL_CHARCOAL("coal", "charcoal", 263, 1, "items/coal_charcoal.png"),
    I_264_0_DIAMOND("diamond", null, 264, 0, "items/diamond.png"),
    I_265_0_IRON_INGOT("iron_ingot", null, 265, 0, "items/iron_ingot.png"),
    I_266_0_GOLD_INGOT("gold_ingot", null, 266, 0, "items/gold_ingot.png"),
    I_267_0_IRON_SWORD("iron_sword", null, 267, 0, "items/iron_sword.png"),
    I_268_0_WOODEN_SWORD("wooden_sword", null, 268, 0, "items/wooden_sword.png"),
    I_269_0_WOODEN_SHOVEL("wooden_shovel", null, 269, 0, "items/wooden_shovel.png"),
    I_270_0_WOODEN_PICKAXE("wooden_pickaxe", null, 270, 0, "items/wooden_pickaxe.png"),
    I_271_0_WOODEN_AXE("wooden_axe", null, 271, 0, "items/wooden_axe.png"),
    I_272_0_STONE_SWORD("stone_sword", null, 272, 0, "items/stone_sword.png"),
    I_273_0_STONE_SHOVEL("stone_shovel", null, 273, 0, "items/stone_shovel.png"),
    I_274_0_STONE_PICKAXE("stone_pickaxe", null, 274, 0, "items/stone_pickaxe.png"),
    I_275_0_STONE_AXE("stone_axe", null, 275, 0, "items/stone_axe.png"),
    I_276_0_DIAMOND_SWORD("diamond_sword", null, 276, 0, "items/diamond_sword.png"),
    I_277_0_DIAMOND_SHOVEL("diamond_shovel", null, 277, 0, "items/diamond_shovel.png"),
    I_278_0_DIAMOND_PICKAXE("diamond_pickaxe", null, 278, 0, "items/diamond_pickaxe.png"),
    I_279_0_DIAMOND_AXE("diamond_axe", null, 279, 0, "items/diamond_axe.png"),
    I_280_0_STICK("stick", null, 280, 0, "items/stick.png"),
    I_281_0_BOWL("bowl", null, 281, 0, "items/bowl.png"),
    I_282_0_MUSHROOM_STEW("mushroom_stew", null, 282, 0, "items/mushroom_stew.png"),
    I_283_0_GOLDEN_SWORD("golden_sword", null, 283, 0, "items/golden_sword.png"),
    I_284_0_GOLDEN_SHOVEL("golden_shovel", null, 284, 0, "items/golden_shovel.png"),
    I_285_0_GOLDEN_PICKAXE("golden_pickaxe", null, 285, 0, "items/golden_pickaxe.png"),
    I_286_0_GOLDEN_AXE("golden_axe", null, 286, 0, "items/golden_axe.png"),
    I_287_0_STRING("string", null, 287, 0, "items/string.png"),
    I_288_0_FEATHER("feather", null, 288, 0, "items/feather.png"),
    I_289_0_GUNPOWDER("gunpowder", null, 289, 0, "items/gunpowder.png"),
    I_290_0_WOODEN_HOE("wooden_hoe", null, 290, 0, "items/wooden_hoe.png"),
    I_291_0_STONE_HOE("stone_hoe", null, 291, 0, "items/stone_hoe.png"),
    I_292_0_IRON_HOE("iron_hoe", null, 292, 0, "items/iron_hoe.png"),
    I_293_0_DIAMOND_HOE("diamond_hoe", null, 293, 0, "items/diamond_hoe.png"),
    I_294_0_GOLDEN_HOE("golden_hoe", null, 294, 0, "items/golden_hoe.png"),
    I_295_0_WHEAT_SEEDS("wheat_seeds", null, 295, 0, "items/wheat_seeds.png"),
    I_296_0_WHEAT("wheat", null, 296, 0, "items/wheat.png"),
    I_297_0_BREAD("bread", null, 297, 0, "items/bread.png"),
    I_298_0_LEATHER_HELMET("leather_helmet", null, 298, 0, "items/leather_helmet.png"),
    I_299_0_LEATHER_CHESTPLATE("leather_chestplate", null, 299, 0, "items/leather_chestplate.png"),
    I_300_0_LEATHER_LEGGINGS("leather_leggings", null, 300, 0, "items/leather_leggings.png"),
    I_301_0_LEATHER_BOOTS("leather_boots", null, 301, 0, "items/leather_boots.png"),
    I_302_0_CHAINMAIL_HELMET("chainmail_helmet", null, 302, 0, "items/chainmail_helmet.png"),
    I_303_0_CHAINMAIL_CHESTPLATE("chainmail_chestplate", null, 303, 0, "items/chainmail_chestplate.png"),
    I_304_0_CHAINMAIL_LEGGINGS("chainmail_leggings", null, 304, 0, "items/chainmail_leggings.png"),
    I_305_0_CHAINMAIL_BOOTS("chainmail_boots", null, 305, 0, "items/chainmail_boots.png"),
    I_306_0_IRON_HELMET("iron_helmet", null, 306, 0, "items/iron_helmet.png"),
    I_307_0_IRON_CHESTPLATE("iron_chestplate", null, 307, 0, "items/iron_chestplate.png"),
    I_308_0_IRON_LEGGINGS("iron_leggings", null, 308, 0, "items/iron_leggings.png"),
    I_309_0_IRON_BOOTS("iron_boots", null, 309, 0, "items/iron_boots.png"),
    I_310_0_DIAMOND_HELMET("diamond_helmet", null, 310, 0, "items/diamond_helmet.png"),
    I_311_0_DIAMOND_CHESTPLATE("diamond_chestplate", null, 311, 0, "items/diamond_chestplate.png"),
    I_312_0_DIAMOND_LEGGINGS("diamond_leggings", null, 312, 0, "items/diamond_leggings.png"),
    I_313_0_DIAMOND_BOOTS("diamond_boots", null, 313, 0, "items/diamond_boots.png"),
    I_314_0_GOLDEN_HELMET("golden_helmet", null, 314, 0, "items/golden_helmet.png"),
    I_315_0_GOLDEN_CHESTPLATE("golden_chestplate", null, 315, 0, "items/golden_chestplate.png"),
    I_316_0_GOLDEN_LEGGINGS("golden_leggings", null, 316, 0, "items/golden_leggings.png"),
    I_317_0_GOLDEN_BOOTS("golden_boots", null, 317, 0, "items/golden_boots.png"),
    I_318_0_FLINT("flint", null, 318, 0, "items/flint.png"),
    I_319_0_PORKCHOP("porkchop", null, 319, 0, "items/porkchop.png"),
    I_320_0_COOKED_PORKCHOP("cooked_porkchop", null, 320, 0, "items/cooked_porkchop.png"),
    I_321_0_PAINTING("painting", null, 321, 0, "items/painting.png"),
    I_322_0_GOLDEN_APPLE("golden_apple", null, 322, 0, "items/golden_apple.png"),
    I_323_0_SIGN("sign", null, 323, 0, "items/sign.png"),
    I_324_0_WOODEN_DOOR("wooden_door", null, 324, 0, "items/wooden_door.png"),
    I_325_0_BUCKET_BUCKET("bucket", "bucket", 325, 0, "items/bucket_bucket.png"),
    I_325_1_BUCKET_MILK("bucket", "milk", 325, 1, "items/bucket_milk.png"),
    I_325_8_BUCKET_BUCKET_WATER("bucket", "bucket_water", 325, 8, "items/bucket_bucket_water.png"),
    I_325_10_BUCKET_BUCKET_LAVA("bucket", "bucket_lava", 325, 10, "items/bucket_bucket_lava.png"),
    I_328_0_MINECART("minecart", null, 328, 0, "items/minecart.png"),
    I_329_0_SADDLE("saddle", null, 329, 0, "items/saddle.png"),
    I_330_0_IRON_DOOR("iron_door", null, 330, 0, "items/iron_door.png"),
    I_331_0_REDSTONE("redstone", null, 331, 0, "items/redstone.png"),
    I_332_0_SNOWBALL("snowball", null, 332, 0, "items/snowball.png"),
    I_333_0_BOAT_OAK("boat", "oak", 333, 0, "items/boat_oak.png"),
    I_333_1_BOAT_SPRUCE("boat", "spruce", 333, 1, "items/boat_spruce.png"),
    I_333_2_BOAT_BIRCH("boat", "birch", 333, 2, "items/boat_birch.png"),
    I_333_3_BOAT_JUNGLE("boat", "jungle", 333, 3, "items/boat_jungle.png"),
    I_333_4_BOAT_ACACIA("boat", "acacia", 333, 4, "items/boat_acacia.png"),
    I_333_5_BOAT_BIG_OAK("boat", "big_oak", 333, 5, "items/boat_big_oak.png"),
    I_334_0_LEATHER("leather", null, 334, 0, "items/leather.png"),
    I_336_0_BRICK("brick", null, 336, 0, "items/brick.png"),
    I_337_0_CLAY_BALL("clay_ball", null, 337, 0, "items/clay_ball.png"),
    I_338_0_REEDS("reeds", null, 338, 0, "items/reeds.png"),
    I_339_0_PAPER("paper", null, 339, 0, "items/paper.png"),
    I_340_0_BOOK("book", null, 340, 0, "items/book.png"),
    I_341_0_SLIME_BALL("slime_ball", null, 341, 0, "items/slime_ball.png"),
    I_342_0_CHEST_MINECART("chest_minecart", null, 342, 0, "items/chest_minecart.png"),
    I_344_0_EGG("egg", null, 344, 0, "items/egg.png"),
    I_345_0_COMPASS("compass", null, 345, 0, "items/compass.png"),
    I_346_0_FISHING_ROD("fishing_rod", null, 346, 0, "items/fishing_rod.png"),
    I_347_0_CLOCK("clock", null, 347, 0, "items/clock.png"),
    I_348_0_GLOWSTONE_DUST("glowstone_dust", null, 348, 0, "items/glowstone_dust.png"),
    I_349_0_FISH("fish", null, 349, 0, "items/fish.png"),
    I_350_0_COOKED_FISH("cooked_fish", null, 350, 0, "items/cooked_fish.png"),
    I_351_0_DYE_BLACKINKSAC("dye", "black", 351, 0, "items/dye_powder_black.png"),
    I_351_1_DYE_RED("dye", "red", 351, 1, "items/dye_powder_red.png"),
    I_351_2_DYE_GREEN("dye", "green", 351, 2, "items/dye_powder_green.png"),
    I_351_3_DYE_BROWNCOCOABEANS("dye", "brown", 351, 3, "items/dye_powder_brown.png"),
    I_351_4_DYE_BLUE("dye", "blue", 351, 4, "items/dye_powder_blue.png"),
    I_351_5_DYE_PURPLE("dye", "purple", 351, 5, "items/dye_powder_purple.png"),
    I_351_6_DYE_CYAN("dye", "cyan", 351, 6, "items/dye_powder_cyan.png"),
    I_351_7_DYE_SILVER("dye", "silver", 351, 7, "items/dye_powder_silver.png"),
    I_351_8_DYE_GRAY("dye", "gray", 351, 8, "items/dye_powder_gray.png"),
    I_351_9_DYE_PINK("dye", "pink", 351, 9, "items/dye_powder_pink.png"),
    I_351_10_DYE_LIME("dye", "lime", 351, 10, "items/dye_powder_lime.png"),
    I_351_11_DYE_YELLOW("dye", "yellow", 351, 11, "items/dye_powder_yellow.png"),
    I_351_12_DYE_LIGHT_BLUE("dye", "light_blue", 351, 12, "items/dye_powder_light_blue.png"),
    I_351_13_DYE_MAGENTA("dye", "magenta", 351, 13, "items/dye_powder_magenta.png"),
    I_351_14_DYE_ORANGE("dye", "orange", 351, 14, "items/dye_powder_orange.png"),
    I_351_15_DYE_WHITEBONEMEAL("dye", "white", 351, 15, "items/dye_powder_white.png"),
    I_352_0_BONE("bone", null, 352, 0, "items/bone.png"),
    I_353_0_SUGAR("sugar", null, 353, 0, "items/sugar.png"),
    I_354_0_CAKE("cake", null, 354, 0, "items/cake.png"),
    I_355_0_BED("bed", null, 355, 0, "items/bed.png"),
    I_356_0_REPEATER("repeater", null, 356, 0, "items/repeater.png"),
    I_357_0_COOKIE("cookie", null, 357, 0, "items/cookie.png"),
    I_358_0_MAP_FILLED("map_filled", null, 358, 0, "items/map_filled.png"),
    I_359_0_SHEARS("shears", null, 359, 0, "items/shears.png"),
    I_360_0_MELON("melon", null, 360, 0, "items/melon.png"),
    I_361_0_PUMPKIN_SEEDS("pumpkin_seeds", null, 361, 0, "items/pumpkin_seeds.png"),
    I_362_0_MELON_SEEDS("melon_seeds", null, 362, 0, "items/melon_seeds.png"),
    I_363_0_BEEF("beef", null, 363, 0, "items/beef.png"),
    I_364_0_COOKED_BEEF("cooked_beef", null, 364, 0, "items/cooked_beef.png"),
    I_365_0_CHICKEN("chicken", null, 365, 0, "items/chicken.png"),
    I_366_0_COOKED_CHICKEN("cooked_chicken", null, 366, 0, "items/cooked_chicken.png"),
    I_367_0_ROTTEN_FLESH("rotten_flesh", null, 367, 0, "items/rotten_flesh.png"),
    I_368_0_ENDER_PEARL("ender_pearl", null, 368, 0, "items/ender_pearl.png"),
    I_369_0_BLAZE_ROD("blaze_rod", null, 369, 0, "items/blaze_rod.png"),
    I_370_0_GHAST_TEAR("ghast_tear", null, 370, 0, "items/ghast_tear.png"),
    I_371_0_GOLD_NUGGET("gold_nugget", null, 371, 0, "items/gold_nugget.png"),
    I_372_0_NETHER_WART("nether_wart", null, 372, 0, "items/nether_wart.png"),
    I_373_0_POTION("potion", null, 373, 0, "items/potion.png"),
    I_374_0_GLASS_BOTTLE("glass_bottle", null, 374, 0, "items/glass_bottle.png"),
    I_375_0_SPIDER_EYE("spider_eye", null, 375, 0, "items/spider_eye.png"),
    I_376_0_FERMENTED_SPIDER_EYE("fermented_spider_eye", null, 376, 0, "items/fermented_spider_eye.png"),
    I_377_0_BLAZE_POWDER("blaze_powder", null, 377, 0, "items/blaze_powder.png"),
    I_378_0_MAGMA_CREAM("magma_cream", null, 378, 0, "items/magma_cream.png"),
    I_379_0_BREWING_STAND("brewing_stand", null, 379, 0, "items/brewing_stand.png"),
    I_380_0_CAULDRON("cauldron", null, 380, 0, "items/cauldron.png"),
    I_381_0_ENDER_EYE("ender_eye", null, 381, 0, "items/ender_eye.png"),
    I_382_0_SPECKLED_MELON("speckled_melon", null, 382, 0, "items/speckled_melon.png"),
    I_383_0_SPAWN_EGG("spawn_egg", null, 383, 0, "items/spawn_egg.png"),
    I_384_0_EXPERIENCE_BOTTLE("experience_bottle", null, 384, 0, "items/experience_bottle.png"),
    I_385_0_FIREBALL("fireball", null, 385, 0, "items/fireball.png"),
    I_388_0_EMERALD("emerald", null, 388, 0, "items/emerald.png"),
    I_389_0_FRAME("frame", null, 389, 0, "items/frame.png"),
    I_390_0_FLOWER_POT("flower_pot", null, 390, 0, "items/flower_pot.png"),
    I_391_0_CARROT("carrot", null, 391, 0, "items/carrot.png"),
    I_392_0_POTATO("potato", null, 392, 0, "items/potato.png"),
    I_393_0_BAKED_POTATO("baked_potato", null, 393, 0, "items/baked_potato.png"),
    I_394_0_POISONOUS_POTATO("poisonous_potato", null, 394, 0, "items/poisonous_potato.png"),
    I_395_0_EMPTYMAP("emptyMap", null, 395, 0, "items/emptyMap.png"),
    I_396_0_GOLDEN_CARROT("golden_carrot", null, 396, 0, "items/golden_carrot.png"),
    I_397_0_SKULL_SKELETON("skull", "skeleton", 397, 0, "items/skull_skeleton.png"),
    I_397_1_SKULL_WITHER("skull", "wither", 397, 1, "items/skull_wither.png"),
    I_397_2_SKULL_ZOMBIE("skull", "zombie", 397, 2, "items/skull_zombie.png"),
    I_397_3_SKULL_PLAYER("skull", "player", 397, 3, "items/skull_player.png"),
    I_397_4_SKULL_CREEPER("skull", "creeper", 397, 4, "items/skull_creeper.png"),
    I_397_5_SKULL_DRAGON("skull", "dragon", 397, 5, "items/skull_dragon.png"),
    I_398_0_CARROTONASTICK("carrotOnAStick", null, 398, 0, "items/carrotOnAStick.png"),
    I_399_0_NETHERSTAR("netherStar", null, 399, 0, "items/netherStar.png"),
    I_400_0_PUMPKIN_PIE("pumpkin_pie", null, 400, 0, "items/pumpkin_pie.png"),
    I_403_0_ENCHANTED_BOOK("enchanted_book", null, 403, 0, "items/enchanted_book.png"),
    I_404_0_COMPARATOR("comparator", null, 404, 0, "items/comparator.png"),
    I_405_0_NETHERBRICK("netherbrick", null, 405, 0, "items/netherbrick.png"),
    I_406_0_QUARTZ("quartz", null, 406, 0, "items/quartz.png"),
    I_407_0_TNT_MINECART("tnt_minecart", null, 407, 0, "items/tnt_minecart.png"),
    I_408_0_HOPPER_MINECART("hopper_minecart", null, 408, 0, "items/hopper_minecart.png"),
    I_409_0_PRISMARINE_SHARD("prismarine_shard", null, 409, 0, "items/prismarine_shard.png"),
    I_410_0_HOPPER("hopper", null, 410, 0, "items/hopper.png"),
    I_411_0_RABBIT("rabbit", null, 411, 0, "items/rabbit.png"),
    I_412_0_COOKED_RABBIT("cooked_rabbit", null, 412, 0, "items/cooked_rabbit.png"),
    I_413_0_RABBIT_STEW("rabbit_stew", null, 413, 0, "items/rabbit_stew.png"),
    I_414_0_RABBIT_FOOT("rabbit_foot", null, 414, 0, "items/rabbit_foot.png"),
    I_415_0_RABBIT_HIDE("rabbit_hide", null, 415, 0, "items/rabbit_hide.png"),
    I_416_0_HORSEARMORLEATHER("horsearmorleather", null, 416, 0, "items/horsearmorleather.png"),
    I_417_0_HORSEARMORIRON("horsearmoriron", null, 417, 0, "items/horsearmoriron.png"),
    I_418_0_HORSEARMORGOLD("horsearmorgold", null, 418, 0, "items/horsearmorgold.png"),
    I_419_0_HORSEARMORDIAMOND("horsearmordiamond", null, 419, 0, "items/horsearmordiamond.png"),
    I_420_0_LEAD("lead", null, 420, 0, "items/lead.png"),
    I_421_0_NAMETAG("nameTag", null, 421, 0, "items/nameTag.png"),
    I_422_0_PRISMARINE_CRYSTALS("prismarine_crystals", null, 422, 0, "items/prismarine_crystals.png"),
    I_423_0_MUTTONRAW("muttonRaw", null, 423, 0, "items/muttonRaw.png"),
    I_424_0_MUTTONCOOKED("muttonCooked", null, 424, 0, "items/muttonCooked.png"),
    I_426_0_END_CRYSTAL("end_crystal", null, 426, 0, "items/end_crystal.png"),
    I_427_0_SPRUCE_DOOR("spruce_door", null, 427, 0, "items/spruce_door.png"),
    I_428_0_BIRCH_DOOR("birch_door", null, 428, 0, "items/birch_door.png"),
    I_429_0_JUNGLE_DOOR("jungle_door", null, 429, 0, "items/jungle_door.png"),
    I_430_0_ACACIA_DOOR("acacia_door", null, 430, 0, "items/acacia_door.png"),
    I_431_0_DARK_OAK_DOOR("dark_oak_door", null, 431, 0, "items/dark_oak_door.png"),
    I_432_0_CHORUS_FRUIT("chorus_fruit", null, 432, 0, "items/chorus_fruit.png"),
    I_433_0_CHORUS_FRUIT_POPPED("chorus_fruit_popped", null, 433, 0, "items/chorus_fruit_popped.png"),
    I_437_0_DRAGON_BREATH("dragon_breath", null, 437, 0, "items/dragon_breath.png"),
    I_438_0_SPLASH_POTION("splash_potion", null, 438, 0, "items/splash_potion.png"),
    I_441_0_LINGERING_POTION("lingering_potion", null, 441, 0, "items/lingering_potion.png"),
    I_444_0_ELYTRA("elytra", null, 444, 0, "items/elytra.png"),
    I_457_0_BEETROOT("beetroot", null, 457, 0, "items/beetroot.png"),
    I_458_0_BEETROOT_SEEDS("beetroot_seeds", null, 458, 0, "items/seeds_beetroot.png"),
    I_459_0_BEETROOT_SOUP("beetroot_soup", null, 459, 0, "items/beetroot_soup.png"),
    I_460_0_SALMON("salmon", null, 460, 0, "items/fish_salmon.png"),
    I_461_0_CLOWNFISH("clownfish", null, 461, 0, "items/fish_clownfish.png"),
    I_462_0_PUFFERFISH("pufferfish", null, 462, 0, "items/fish_pufferfish.png"),
    I_463_0_COOKED_SALMON("cooked_salmon", null, 463, 0, "items/fish_salmon_cooked.png"),
    I_466_0_APPLEENCHANTED("apple_enchanted", null, 466, 0, "items/apple_golden.png"),
    I_454_0_BOARD_ONE_BY_ONE("board", "one_by_one", 454, 0, "items/chalkboard_small.png"),
    I_454_1_BOARD_TWO_BY_ONE("board", "two_by_one", 454, 1, "items/chalkboard_medium.png"),
    I_454_2_BOARD_THREE_BY_TWO("board", "three_by_two", 454, 2, "items/chalkboard_large.png"),
    I_456_0_PORTFOLIO("portfolio", null, 456, 0, "items/portfolio.png"),
    I_498_0_CAMERA("camera", null, 498, 0, "items/camera.png");


    public final int id, subId;

    public final String name, subName, displayName;

    public final String texPath;

    public final Color color;
    public final boolean hasBiomeShading;

    public Bitmap bitmap;

    Block(String name, String subName, int id, int subId, String texPath, int color, boolean hasBiomeShading){
        this.id = id;
        this.subId = subId;
        this.name = name;
        this.subName = subName;
        this.displayName = name + " " + subName;
        this.texPath = texPath;
        this.color = Color.fromARGB(color);
        this.hasBiomeShading = hasBiomeShading;
    }

    Block(String name, String subName, int id, int subId, String texPath){
        this.id = id;
        this.subId = subId;
        this.name = name;
        this.subName = subName;
        this.displayName = name + " " + subName;
        this.texPath = texPath;
        this.color = null;
        this.hasBiomeShading = false;
    }

    @Override
    public Bitmap getBitmap(){
        return this.bitmap;
    }

    @NonNull
    @Override
    public NamedBitmapProvider getNamedBitmapProvider(){
        return this;
    }

    @NonNull
    @Override
    public String getBitmapDisplayName(){
        return this.displayName;
    }

    @NonNull
    @Override
    public String getBitmapDataName(){
        return name + "@" + subName;
    }

    private static final Map<String, Block> byDataName = new HashMap<>();
    private static final SparseArray<SparseArray<Block>> blockMap;
    static {
        blockMap = new SparseArray<>();
        SparseArray<Block> subMap;
        for(Block b : Block.values()){
            subMap = blockMap.get(b.id);
            if(subMap == null){
                subMap = new SparseArray<>();
                blockMap.put(b.id, subMap);
            }
            subMap.put(b.subId, b);
            if(b.subId == 0) byDataName.put(b.name, b);
            byDataName.put(b.name + "@" + b.subName, b);
        }
    }

    public static Block getByDataName(String dataName){
        return byDataName.get(dataName);
    }

    public static void loadBitmaps(AssetManager assetManager) throws IOException {
        for(Block b : Block.values()){
            if(b.bitmap == null && b.texPath != null){
                try {
                    b.bitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(assetManager.open(b.texPath)), 32, 32, false);
                } catch(FileNotFoundException e){
                    //TODO file-paths were generated from block names; some do not actually exist...
                    //Log.w("File not found! "+b.texPath);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static Block getBlock(int id, int meta){
        if(id < 0) return null;
        SparseArray<Block> subMap = blockMap.get(id);
        if(subMap == null) return null;
        else return subMap.get(meta);
    }

}
