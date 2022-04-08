#
# Copyright (c) 2013-2022 Contributors to the Eclipse Foundation

#
# See the NOTICE file distributed with this work for additional information regarding copyright
# ownership. All rights reserved. This program and the accompanying materials are made available
# under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
# available at http://www.apache.org/licenses/LICENSE-2.0.txt
# ===============================================================================================
from pygw.config import geowave_pkg
from ..statistic import IndexStatistic
from ..statistic_type import IndexStatisticType


class MaxDuplicatesStatistic(IndexStatistic):
    """
    Maintains the maximum number of duplicates that a single entry in the data set contains.
    """
    STATS_TYPE = IndexStatisticType(geowave_pkg.core.store.statistics.index.MaxDuplicatesStatistic.STATS_TYPE)

    def __init__(self, index_name=None, java_ref=None):
        if java_ref is None:
            if index_name is None:
                java_ref = geowave_pkg.core.store.statistics.index.MaxDuplicatesStatistic()
            else:
                java_ref = geowave_pkg.core.store.statistics.index.MaxDuplicatesStatistic(index_name)
        super().__init__(java_ref)
