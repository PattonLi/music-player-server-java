<template>
  <div>
    <MyTitle title="电台推荐" />
    <div class="mb-10 grid grid-flow-row gap-x-20 grid-cols-3 2xl:grid-cols-5 gap-y-9">
      <!-- 循环 -->
      <div
        v-for="(item, index) in _.sampleSize(personalizedAlbums, 20)"
        :key="index"
        @click="routerPushByNameId(Pages.mvDetail, _.random(1, 10))"
      >
        <!-- 封面组件 -->
        <MyCover
          :name="item.album"
          :pic-url="item.picUrl"
          :showPlayCount="true"
          :play-count="item.size"
        />
        <!-- 专辑名 -->
        <div class="mx-2 mt-2 text-lg text-main truncate">
          {{ item.album }}
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
import MyTitle from '@/components/common/MyTitle.vue'
import { useMusicStore } from '@/stores/music'
import MyCover from '@/components/common/MyCover.vue'
import _ from 'lodash'
import { routerPushByNameId } from '@/utils/navigator/router'
import { Pages } from '@/router/pages'

const { personalizedAlbums } = toRefs(useMusicStore())
const { updatePersonalize: UpdatePersonalize } = useMusicStore()

onMounted(async () => {
  await UpdatePersonalize(2)
})
</script>
